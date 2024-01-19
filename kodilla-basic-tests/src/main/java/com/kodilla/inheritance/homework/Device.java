package com.kodilla.inheritance.homework;

public class Device extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Turn on for FIVE minutes");
    }
    public Device(int year) {
        super(year);
    }
}
