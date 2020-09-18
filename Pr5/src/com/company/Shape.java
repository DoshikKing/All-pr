package com.company;

abstract class Shape
{
    String color;
    boolean filled;

    Shape(){};

    void setColor(String color)
    {
        this.color = color;
    };

    String getColor(){return this.color;};

    void setFilled(boolean filled)
    {
        this.filled = filled;
    };

    boolean getFilled(){return this.filled;};

    abstract String _toString();

    abstract double  getArea();

    abstract double Perimetr();

}
