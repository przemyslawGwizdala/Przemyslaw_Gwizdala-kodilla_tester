package com.kodilla.inheritance.homework;
public class OperatingSystemAplication {
    public static void main(String[] args) {
        OperatingSystem operatingsystem = new OperatingSystem(2004);
        operatingsystem.turnOn();

        Device device = new Device(2015);
        device.displayProductionYear();

        OldDevice olddevice = new OldDevice(2006);
        olddevice.displayProductionYear();
    }
}
