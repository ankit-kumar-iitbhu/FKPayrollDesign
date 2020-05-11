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
        this.addToBalance(wage(noOfHours));
        LocalDate today = LocalDate.now();
        TimeCard card = new TimeCard().setDate(today).setNoOfHours(noOfHours);
        timeHistory.add(card);
    }


    @Override
    public void getDailyWage() {
        String transactionDetail="Your Daily earning for following days are :- ";
        double totalEarning=0;
        for(TimeCard card : timeHistory){
            double earning=wage(card.getNoOfHours());
            totalEarning+=earning;
            String temp="\n  On "+card.getDate()+" your earning "+earning;
            transactionDetail+=temp;
        }
        this.deductFromBalance(totalEarning);
        (this.timeHistory).clear();
        System.out.println(transactionDetail);
    }


    @Override
    public void setEmployeeType() {
        this.Type= "HourlyEmployee";
    }

    @Override
    public void makePayement() {
        // TODO Auto-generated method stub

    }

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}



}
    
