package it.unibo.shapes.api;

public class Square implements Polygon {

    private final int EDGES = 4;
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public double getPerimeter() {
        return edge*EDGES;
    }

    public double getArea() {
        return edge*edge;
    }

    public int getEdgeCount() {
        return EDGES;
    }
}
