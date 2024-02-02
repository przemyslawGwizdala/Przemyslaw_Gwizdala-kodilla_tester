package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random random = new Random();

    public static Car drawCar() {
        int randomCarType = random.nextInt(3);
        Car car;

        switch (randomCarType) {
            case 0:
                car = new Ford();
                break;
            case 1:
                car = new Opel();
                break;
            case 2:
                car = new Fiat();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomCarType);
        }

        int randomSpeedIncrease = random.nextInt(50);
        for (int i = 0; i < randomSpeedIncrease; i++) {
            car.increaseSpeed();
        }

        return car;
    }



    public static void main(String[] args) {
        int arraySize = random.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < arraySize; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}