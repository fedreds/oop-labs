package it.unibo.shapes.test;

import it.unibo.shapes.api.Circle;
import it.unibo.shapes.api.Rectangle;
import it.unibo.shapes.api.Square;
import it.unibo.shapes.api.Triangle;

public class WorkWithShapes {
    public static void main(){
        //Created Circle
        Circle circle = new Circle(5);
        //Created Square
        Square square = new Square(2.5);
        //Created Rectangle
        Rectangle rectangle = new Rectangle(2.1, 4.7);
        //Created Triangle
        Triangle triangle = new Triangle(3.3, 6.7, 4.2, 5.0);
        //Get all perimeters in standard output
        IO.println("Circle Perimeter: " + circle.getPerimeter());
        IO.println("Square Perimeter: " + square.getPerimeter());
        IO.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        IO.println("Triangle Perimeter: " + triangle.getPerimeter());
        //Get all areas in standard output
        IO.println("Circle Area: " + circle.getArea());
        IO.println("Square Area: " + square.getArea());
        IO.println("Rectangle Area: " + rectangle.getArea());
        IO.println("Triangle Area: " + triangle.getArea());
    }

}
