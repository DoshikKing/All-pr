package com.company;

public class Oval extends Circle {

    double a, b;

    Oval()
    {
        this.a = 0;
        this.b = 0;
    }

    Oval(double a, double b, double radius)
    {
        this.a = a;
        this.b = b;
        this.radius = radius;
    }

    Oval(double a, double b,double radius, String color, boolean filled)
    {
        this.a = a;
        this.b = b;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    @Override
    String _toString()
    {
        return "Color: " + color + "\n" + "Filled: " + filled + "\n" + "A: " + a + "B: " + b + "\n";
    }

    double getArea()
    {
        return a * b * Math.PI;
    }

    double Perimetr()
    {
        return 2 * Math.PI * (Math.sqrt(((a*a) +(b*b))/2));
    }
}
