package com.kodilla.abstracts.homework2;

public class Animator extends Job{

    public Animator(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Job: Animator");
        System.out.println("Salary: $" + getSalary());
        System.out.println("Responsibilities: " + getResponsibilities());
    }
}