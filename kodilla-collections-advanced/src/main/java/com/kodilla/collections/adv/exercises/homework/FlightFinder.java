package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    Map<String, List<Flight>> flightfinder = new HashMap<>();
    public List<Flight> findFlightsFrom(String departure){
        return flightfinder.getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return flightfinder.getOrDefault(arrival, Collections.emptyList());
    }
    public int size() { return flightfinder.size(); }
}
