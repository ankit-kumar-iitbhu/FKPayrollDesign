package SourceCode.models;

import java.time.LocalDate;

public class Receipt {
    private LocalDate date;
    private double amount;

    public Receipt(LocalDate date,double amount){
        this.date=date;
        this.amount=amount;
    }

    public double getAmmount(){
        return this.amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAmmount(double amount) {
        this.amount = amount;
    }

    
}