package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car fiat = new Fiat();
        cars.add(fiat);
        cars.add(new Ford());
        cars.add(new Opel());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(fiat);

        System.out.println(cars.size());
    }
}