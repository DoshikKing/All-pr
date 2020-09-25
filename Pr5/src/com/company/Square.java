package com.company;

public class Square extends Shape
{
    double side;

    Square()
    {
        this.side = 0;
    }

    Square(double side)
    {
        this.side = side;
    }

    Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    void setSide(double side)
    {
        this.side = side;
    }

    double getSide()
    {
        return this.side;
    }

    @Override
    String _toString() {
        return "Color: " + color + "\n" + "Filled: " + filled + "\n" + "Side: " + side + "\n";
    }

    @Override
    double getArea() {
        return 2*side;
    }

    @Override
    double Perimetr() {
        return 4*side;
    }


}
