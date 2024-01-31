package com.kodilla.abstracts.homework2;

public class Doctor extends Job{

    public Doctor() {
        super(8000, "Health examination, medicine selection");
    }

    @Override
    public String job() {
        return getResponsibilities();
    }
}