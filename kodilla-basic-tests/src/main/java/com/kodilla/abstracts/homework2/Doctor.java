package com.kodilla.abstracts.homework2;

public class Doctor extends Job{

    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Job: Doctor");
        System.out.println("Salary: $" + getSalary());
        System.out.println("Responsibilities: " + getResponsibilities());
    }
}