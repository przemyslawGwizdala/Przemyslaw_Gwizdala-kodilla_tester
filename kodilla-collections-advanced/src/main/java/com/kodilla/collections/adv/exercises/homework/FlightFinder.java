package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    List<Flight> flightfinder = FlightRepository.getFlightsTable();
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> from = flightfinder
                .stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toList());

        return from;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> to = flightfinder
                .stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());

        return to;
    }

}
