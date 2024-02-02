package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> order = new HashMap<>();

        Principal mariusz = new Principal ("Mariusz", "SchoolX");
        Principal tadeusz = new Principal ("Tadeusz", "SchoolY");
        Principal zbigniew = new Principal ("Zbigniew", "SchoolZ");


        School mariuszSchool = new School(Arrays.asList(50.0,50.0,50.0,50.0,50.0));
        School tadeuszSchool = new School(Arrays.asList(40.0,40.0,40.0,40.0,40.0));
        School zbigniewSchool = new School(Arrays.asList(30.0,30.0,30.0,30.0));
        
        order.put(mariusz, mariuszSchool);
        order.put(tadeusz, tadeuszSchool);
        order.put(zbigniew, zbigniewSchool);

        for (Map.Entry<Principal, School> principalEntry : order.entrySet()) {
            System.out.println("Principal name: " + principalEntry.getKey().getPrincipalname() + "    "
                    + "School name: " + principalEntry.getKey().getSchoolname() + "    "
                    + "Amount of students in school: " + principalEntry.getValue().getAllStudents());
        }
    }
}
