package com.company;

public class Cube extends Square {

    String _is3D()
    {
        return "3D!";
    }
    @Override
    String _toString()
    {
        return "Color: " + color + "\n" + "Filled: " + filled + "\n" + "Side: " + side + "\n";
    }

    double getArea()
    {
        return side * side * 6;
    }
}
