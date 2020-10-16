package com.company;


public enum Planet{

    MERCURY(3.3e+23, 2.42e+6),

    VENUS(4.9e+24, 6.1e+6),

    EARTH(6e+24, 6.4e+6),

    MARS(6.4e+23, 3.4e+6),

    JUPITER(1.9e+27, 7.1e+6),

    SATURN(5.7e+26, 6e+6),

    URANUS(8.7e+25, 2.6e+6),

    NEPTUNE(1e+26, 2.5e+6);

    private double weight, radius;
    private double gravityConst = 6.7e-11;

    Planet(double weight, double radius){
        this.weight = weight;
        this.radius = radius;
    }

    public double getGravity(){
        return (gravityConst * weight / Math.pow(radius, 2));
    }
}
