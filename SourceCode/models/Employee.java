package SourceCode.models;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Employee {
    
    protected int id;
    protected String name;
    protected boolean union;
    protected String Type;
    protected PayementChoice payementChoice;
    protected double balance;
    protected LocalDate lastPaid;
    protected ArrayList<String> transactionHistory;

    protected static int employeeNo = 0;


    public Employee(){
        this.id=employeeNo;
        employeeNo+=1;
    }

    public void addToBalance(double credit){
        this.balance += credit;
    }

    public void deductFromBalance(double credit){
        this.balance -=credit;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUnion() {
        return union;
    }

    public void setUnion(boolean union) {
        this.union = union;
    }

    public String getType() {
        return Type;
    }

    public PayementChoice getPayementChoice() {
        return payementChoice;
    }

    public void setPayementChoice(PayementChoice payementChoice) {
        this.payementChoice = payementChoice;
    }

    public double getBalance() {
        return balance;
    }

// setBalance permission not granted

    public LocalDate getLastPaid() {
        return lastPaid;
    }

    public void setLastPaid(LocalDate lastPaid) {
        this.lastPaid = lastPaid;
    }

}