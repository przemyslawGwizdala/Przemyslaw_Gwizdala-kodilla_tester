package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        double area = Shape.circleArea(10);          // [1]
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        double p = Shape.circlePerimeter(10);
        System.out.println("Perimeter of Circle is equal to " + p);
    }
}
