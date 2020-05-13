package SourceCode.models;

import java.util.ArrayList;

import SourceCode.interfaces.Commission;
import SourceCode.interfaces.EmployeeInterface;

public class SalariedEmployee extends Employee implements EmployeeInterface,Commission{
    
    private double flatSalary;
    private double commissionRate;  // in percentage
    private ArrayList<Receipt> receiptList;

    public SalariedEmployee(){
        super();
        receiptList=new ArrayList<Receipt>();
    }


    public void setEmployeeType(){
        this.Type= "SalariedEmployee";
    }

    private double calculateCommssion(Receipt r){
        return (r.getAmmount()*this.commissionRate)/100;
    }

    @Override
    public void getCommission() {
        String transactionDetail="Your Commissions for sale are as follows:-";
        double totalEarning=0;
        for(Receipt r:receiptList){
            double earning = calculateCommssion(r);
            totalEarning+=earning;
            String temp="\n On "+r.getDate()+", sales ammout= "+r.getAmmount()+", commission ="+earning;
            transactionDetail+=temp;
        }

        this.addToBalance(totalEarning);
        
        (this.receiptList).clear();
        System.out.println(transactionDetail);
        System.out.println("total "+totalEarning+" credited to employee"+this.getId());
    
    }

    @Override
    public void submitReceipt(Receipt receipt) {
        receiptList.add(receipt);
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