package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double radius;
    public Shape(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    static final double PI = 3.1415927;
    public static double circlePerimeter(double r) {
        return 2 * PI * r;
    }
    public static double circleArea(double r) { return PI * r * r; }
    public abstract void giveSize();
}
