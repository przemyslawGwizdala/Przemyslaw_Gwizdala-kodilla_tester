package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car description: ");
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Increasing speed...");
        car.increaseSpeed();
        System.out.println("New speed after increase: " + car.getSpeed());
        System.out.println("Decreasing speed...");
        car.decreaseSpeed();
        System.out.println("New speed after decrease: " + car.getSpeed());
        System.out.println("----------------------------");
    }
}