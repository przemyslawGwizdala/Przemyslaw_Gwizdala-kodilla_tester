package com.kodilla.abstracts.homework2;

public class Application {
    public static void main(String[] args) {

        Animator animator = new Animator(5000,"Work with PC, Rigging");
        Builder builder = new Builder(4000, "Manual work, lifting weights");
        Doctor doctor = new Doctor(9000, "Health examination, medicine selection");

        Person person = new Person("Antek", 40, animator);
        Person person1 = new Person("Bob", 32, builder);
        Person person2 = new Person("Damian", 50, doctor);

        person.displayJobResponsibilities();
        System.out.println(" ");
        person1.displayJobResponsibilities();
        System.out.println(" ");
        person2.displayJobResponsibilities();
    }
}
