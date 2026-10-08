package it.unibo.shapes.api;

public class Triangle implements Polygon {

    private final int EDGES = 3;
    private double base;
    private double baseHeight;
    private double edge1;
    private double edge2;

    public Triangle(double base, double baseHeight, double edge1, double edge2) {
        this.base = base;
        this.baseHeight = baseHeight;
        this.edge1 = edge1;
        this.edge2 = edge2;
    }
    
    public double getPerimeter() {
        return base+edge1+edge2;
    }

    public double getArea() {
        return (base*baseHeight)/2;
    }

    public int getEdgeCount() {
        return EDGES;
    }

}
