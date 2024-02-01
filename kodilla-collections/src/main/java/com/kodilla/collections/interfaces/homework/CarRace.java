package com.kodilla.collections.interfaces.homework;
public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford();
        doRace(ford);

        Car opel = new Opel();
        doRace(opel);

        Car fiat = new Fiat();
        doRace(fiat);
    }

    public static void doRace(Car car) {
        for (int i = 0; i<3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Final speed of car: " + car.getSpeed());
    }
}
