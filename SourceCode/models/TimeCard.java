package SourceCode.models;

import java.time.LocalDate;

public class TimeCard {
    private LocalDate date;
    private double noOfHours;

    public LocalDate getDate() {
        return date;
    }

    public double getNoOfHours() {
        return noOfHours;
    }

    public TimeCard setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public TimeCard setNoOfHours(double noOfHours) {
        this.noOfHours = noOfHours;
        return this;
    }



}