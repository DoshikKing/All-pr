package com.company;

public class Main {


    public static void main(String[] args) {
	Rectangle rectangle = new Rectangle();

	rectangle.setLength(12);
	rectangle.setHeigth(13);
	rectangle.setColor("red");
	rectangle.setFilled(true);

	System.out.println(rectangle._toString());

	Square square = new Square();

    square.setSide(12);
    square.setColor("red");
    square.setFilled(true);

    System.out.println(square._toString());

    Circle circle = new Circle();

	circle.setRadius(20);
	circle.setColor("blue");
	circle.setFilled(true);

	System.out.println(circle._toString());
	System.out.println(circle.getArea());

    }
}
