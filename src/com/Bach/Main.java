package com.Bach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8 , "black", true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "Yellow", true);
        System.out.println(square);

        Shape[] shapes = new Shape[3];
        shapes[0] =(Circle) new Circle();
        shapes[1] = (Square) new Square();
        shapes[2] = (Rectangle) new Rectangle();
        for (Shape Shape: shapes) {
            if (shape instanceof Square) {
                System.out.println(shape);
                ((Square) shape).howtoColor();
            } else System.out.println(shape);
        }
    }
}
