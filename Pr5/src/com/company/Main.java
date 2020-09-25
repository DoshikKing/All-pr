package com.company;

public class Main {


    public static void main(String[] args) {
	Rectangle rectangle = new Rectangle();

	rectangle.setLength(12);
	rectangle.setLength(13);
	rectangle.setColor("red");
	rectangle.setFilled(true);

	System.out.println(rectangle._toString());

	Square square = new Square();

    square.setSide(12);
    square.setColor("red");
    square.setFilled(true);

    System.out.println(square._toString());
    }
}
