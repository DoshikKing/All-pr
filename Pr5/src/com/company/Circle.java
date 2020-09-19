package com.company;

public class Circle extends Shape
{
    double radius;

    Circle()
    {
        this.radius = 0;
    }

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    void setRadius(double radius)
    {
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    @Override
    String _toString() {
        return "Color: " + color + "\n" + "Filled: " + filled + "\n" + "Radius: " + radius + "\n";
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double Perimetr() {
        return 2*Math.PI*radius;
    }
}
