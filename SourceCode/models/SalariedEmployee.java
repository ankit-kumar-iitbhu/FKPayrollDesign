package SourceCode.models;

import SourceCode.interfaces.Commission;
import SourceCode.interfaces.EmployeeInterface;

public class SalariedEmployee extends Employee implements EmployeeInterface,Commission{
    
    private double flatSalary;
    private double commissionRate;  // in percentage

    public String setEmployeeType(){
        return "SalariedEmployee";
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

    

    

}