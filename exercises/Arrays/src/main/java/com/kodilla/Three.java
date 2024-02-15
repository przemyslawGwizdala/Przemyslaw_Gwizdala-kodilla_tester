package com.kodilla;

public class Three {
    public static void main(String[] args) {
        int [] grades = {4,5,6,2,3,3,5};
        double sum = 0;
        for(int i=0; i< grades.length; i++){
            sum += grades[i];
        }
        sum /= grades.length;
        System.out.println(sum);

    }
}
