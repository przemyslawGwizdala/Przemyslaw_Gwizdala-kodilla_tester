package com.kodilla.abstracts.homework;

public class SmallCircle extends Shape {
    public SmallCircle() {super (10)};

    @Override
    public void giveSize() {
        System.out.println("Small circle");
    }
}