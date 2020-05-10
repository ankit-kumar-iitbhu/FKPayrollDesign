package SourceCode.models;

import SourceCode.interfaces.Commission;
import SourceCode.interfaces.EmployeeInterface;

public class SalariedEmployee extends Employee implements EmployeeInterface,Commission{
    
    private double flatSalary;
    private double commissionRate;  // in percentage

    public void setEmployeeType(){
        this.Type= "SalariedEmployee";
    }

    @Override
    public void getCommission() {
        // TODO Auto-generated method stub

    }

    @Override
    public void submitReceipt(Receipt receipt) {
        // TODO Auto-generated method stub

    }

 

    @Override
    public void makePayement() {
        // TODO Auto-generated method stub

    }

    public double getFlatSalary() {
        return flatSalary;
    }

    public void setFlatSalary(double flatSalary) {
        this.flatSalary = flatSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    

    

}