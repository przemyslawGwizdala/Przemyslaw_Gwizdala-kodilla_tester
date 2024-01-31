package com.kodilla.abstracts.homework2;

public class Application {
    // Dodaj metodę, która wyświetli obowiązki danej osoby w pracy
    public static void main(String[] args) {

        Animator animator = new Animator();
        String result = animator.job();

        Builder builder = new Builder();
        String result1 = builder.job();

        Doctor doctor = new Doctor();
        String result2 = doctor.job();

        Person person = new Person("Antek", 40, "Animator");
        Person person1 = new Person("Bob", 32, "Builder");
        Person person2 = new Person("Damian", 50, "Doctor");
        System.out.println("Name: " + person.getFirstName() + "     " + "Responsibilities: " + result);
        System.out.println("Name: " + person1.getFirstName() + "       " + "Responsibilities: " + result1);
        System.out.println("Name: " + person2.getFirstName() + "    " + "Responsibilities: " + result2);

    }
}
