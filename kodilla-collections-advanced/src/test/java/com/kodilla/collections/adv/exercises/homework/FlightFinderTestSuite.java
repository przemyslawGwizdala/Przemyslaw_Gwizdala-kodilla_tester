package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        // given
        FlightFinder flightfinder = new FlightFinder();
        // when
        List<Flight> findFlightsFrom = flightfinder.findFlightsFrom("Kraków");
        // then
        assertEquals(2,findFlightsFrom.size());
    }

    @Test
    void findFlightsTo() {
        // given
        FlightFinder flightfinder = new FlightFinder();
        // when
        List<Flight> findFlightsTo = flightfinder.findFlightsTo("Warszawa");
        // then
        assertEquals(3,findFlightsTo.size());
    }
}