package com.kodilla.abstracts.homework;

public class SmallCircle extends Shape {
    public SmallCircle() {super (10);}

    @Override
    public double circlePerimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    public double circleArea() {
        return PI * getRadius() * getRadius();
    }
}