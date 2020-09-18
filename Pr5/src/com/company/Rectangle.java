package com.company;

public class Rectangle extends Shape
{
    int length, heigth;

    Rectangle()
    {
        this.heigth = 0;
        this.length = 0;
    }

    Rectangle(int length, int heigth)
    {
        this.length = length;
        this.heigth = heigth;
    }

    Rectangle(int length, int heigth, String color, boolean filled)
    {
        this.length = length;
        this.heigth = heigth;
        this.color = color;
        this.filled = filled;
    }

    @Override
    String _toString()
    {
        return "Color: " + color + "\n" + "Filled: " + filled + "\n" + "Length: " + length + "\n" + "Heigth: " + heigth + "\n";
    }

    @Override
    double getArea()
    {
        return length * heigth;
    }

    @Override
    double Perimetr()
    {
        return (2*length) +(2*heigth);
    }
}
