package com.kodilla.abstracts.homework;

public class HugeCircle extends Shape {
    public HugeCircle() {super (1000)};

    @Override
    public void giveSize() {
        System.out.println("Huge Circle");
    }
}