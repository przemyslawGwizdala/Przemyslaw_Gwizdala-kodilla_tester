package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> students = new ArrayList<>();

    public School (List<Double> students) {
        this.students = students;
    }

    public double getAllStudents() {
        double sum = 0.0;
        for (double student : students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
