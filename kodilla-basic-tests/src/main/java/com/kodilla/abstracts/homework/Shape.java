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
    public abstract double circlePerimeter();
    public abstract double circleArea();
}