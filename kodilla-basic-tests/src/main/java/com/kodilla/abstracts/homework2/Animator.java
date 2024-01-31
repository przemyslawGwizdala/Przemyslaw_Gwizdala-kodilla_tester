package com.kodilla.abstracts.homework2;

public class Animator extends Job{

    public Animator() {
        super(3000, "Working with PC, quality control, rigging");
    }

    @Override
    public String job() {
        return getResponsibilities();
    }
}