package com.kodilla.abstracts.homework;

public class MediumCircle extends Shape {
    public MediumCircle() {super (100);}

    @Override
    public double circlePerimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    public double circleArea() {
        return PI * getRadius() * getRadius();
    }
}