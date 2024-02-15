package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Applocation {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Renata Wolna");
        Teacher teacher2 = new Teacher("Grzegorz Klamka");
        Teacher teacher3 = new Teacher(null);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bartek Makłowicz",teacher1));
        students.add(new Student("Zuzanna Centek", teacher1));
        students.add(new Student("Karol Winiary", teacher3));
        students.add(new Student("Kamila Gruszka", teacher2));
        students.add(new Student("Alberto Ciko", teacher2));
        students.add(new Student("Basia Kopytko", teacher3));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + "   "
                    + "Nauczyciel: " + teacherName);
        }
    }
}