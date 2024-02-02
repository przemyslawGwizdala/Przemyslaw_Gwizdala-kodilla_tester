package com.kodilla.collections.adv.maps.complex;

import java.util.Objects;

public class Student {
    private String lastname;
    private String firstname;

    public Student(String lastName, String firstname) {
        this.lastname = lastName;
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return Objects.equals(lastname, student.lastname)
                && Objects.equals(firstname, student.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
