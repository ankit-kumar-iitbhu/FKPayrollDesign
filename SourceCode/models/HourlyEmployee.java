package SourceCode.models;

import java.time.LocalDate;
import java.util.ArrayList;
import SourceCode.interfaces.EmployeeInterface;
import SourceCode.interfaces.ManageTimeCard;

public class HourlyEmployee extends Employee implements EmployeeInterface,ManageTimeCard{

    private double hourlyRate;
    private ArrayList<TimeCard> timeHistory;
    private final static double OVERTIME = 1.5;
    

//return wage earned based on number on
    private double wage(double time){
        double wage=time*this.hourlyRate;
        if(time>8){
            wage+=((OVERTIME-1)*(time-8));
        }
        return wage;
    }

    @Override
    public void postTimeCard(double noOfHours) {
        
        // implementation left
    }



    @Override
    public void getDailyWage() {
         
        //implementation left

    }


    @Override
    public String setEmployeeType() {
        return "HourlyEmployee";
    }

    @Override
    public void makePayement() {
        // TODO Auto-generated method stub

    }



}
    
