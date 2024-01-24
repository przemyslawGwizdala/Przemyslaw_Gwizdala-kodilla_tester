package com.kodilla.abstracts.homework;

public class HugeCircle extends Shape {
    public HugeCircle() {super (1000);}

    @Override
    public double circlePerimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    public double circleArea() {
        return PI * getRadius() * getRadius();
    }
}