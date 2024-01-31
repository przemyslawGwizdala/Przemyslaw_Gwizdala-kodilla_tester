package com.kodilla.abstracts.homework2;

public class Builder extends Job{

    public Builder() {
        super(2400, "Manual work, quality control");
    }

    @Override
    public String job() {
        return getResponsibilities();
    }
}