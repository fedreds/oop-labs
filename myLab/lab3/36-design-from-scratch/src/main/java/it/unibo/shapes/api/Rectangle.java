package it.unibo.shapes.api;

public class Rectangle implements Polygon {

    private final int EDGES = 4;
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getPerimeter() {
        return (base+height)*2;
    }

    public double getArea() {
        return base*height;
    }

    public int getEdgeCount() {
        return EDGES;
    }
}
