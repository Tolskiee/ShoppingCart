package com.company;

import java.time.LocalTime;

public class Cashier extends Person{
    LocalTime startOfShift;
    LocalTime endOfShift;

    public Cashier(String name,LocalTime startOfShift, LocalTime endOfShift) {
        super(name);
        this.startOfShift = startOfShift;
        this.endOfShift = endOfShift;
    }

    public LocalTime getStartOfShift() {
        return startOfShift;
    }

    public void setStartOfShift(LocalTime startOfShift) {
        this.startOfShift = startOfShift;
    }

    public LocalTime getEndOfShift() {
        return endOfShift;
    }

    public void setEndOfShift(LocalTime endOfShift) {
        this.endOfShift = endOfShift;
    }
}
