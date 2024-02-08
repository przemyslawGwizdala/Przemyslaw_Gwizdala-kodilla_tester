package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Bydgoszcz", "Warszawa"));
        flights.add(new Flight("Poznań", "Gdańsk"));
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Bydgoszcz"));
        return  flights;
    }
}
