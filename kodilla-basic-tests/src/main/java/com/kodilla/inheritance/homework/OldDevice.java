package com.kodilla.inheritance.homework;

public class OldDevice extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Turn on for ONE minute");
    }
    @Override
    public void turnOff() {
        System.out.println("Turn off for ONE minute");
    }
    public OldDevice(int year) {
        super(year);
    }
}
