package com.kodilla.abstracts.homework2;
public class Person {
    private String firstName;
    private int age;
    private Job job;
    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void displayJobResponsibilities() {
        System.out.println("Person: " + firstName);
        System.out.println("Age: " + age);
        job.displayJobDetails();
    }
}