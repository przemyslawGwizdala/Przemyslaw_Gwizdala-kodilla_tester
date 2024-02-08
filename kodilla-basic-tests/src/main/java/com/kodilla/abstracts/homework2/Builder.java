package com.kodilla.abstracts.homework2;

public class Builder extends Job{

    public Builder(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Job: Builder");
        System.out.println("Salary: $" + getSalary());
        System.out.println("Responsibilities: " + getResponsibilities());
    }
}