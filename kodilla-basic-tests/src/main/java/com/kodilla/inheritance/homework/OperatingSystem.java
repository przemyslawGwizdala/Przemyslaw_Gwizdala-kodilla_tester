package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Device turned ON");
    }

    public void turnOff() {
        System.out.println("Device turned OFF");
    }

    public int getYear() {
        return year;
    }

    public void displayProductionYear() {
        System.out.println("Production year: " + year);
    }
}
