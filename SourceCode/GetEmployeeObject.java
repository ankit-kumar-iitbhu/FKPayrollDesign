package SourceCode;

import java.time.LocalDate;
import java.util.Scanner;

import SourceCode.models.Employee;
import SourceCode.models.HourlyEmployee;
import SourceCode.models.SalariedEmployee;

public class GetEmployeeObject{
    static Scanner sc =new Scanner(System.in);



    public static HourlyEmployee getHourlyEmployeeObject(){

        HourlyEmployee current = new HourlyEmployee(); 

        System.out.println("New Hourly Employee to be created :- ");

        System.out.println("Enter name ");
        String name = sc.nextLine();
        current.setName(name);

        System.out.println("Enter joining date in YYYY-MM-DD format ");
        String temp = sc.nextLine();
        LocalDate joiningDate=LocalDate.parse(temp);
        current.setLastPaid(joiningDate);

        System.out.println("Payment Choice: ");
        System.out.println("Enter 1 for MAILED_TO_POSTAL_ADDRESS,2 for PICKUP_FROM_PAYMASTER,and 3 forDEPOSITED_TO_BANK_ACCOUNT");
        temp = sc.nextLine();
        int choice = Integer.parseInt(temp);
        current.setPayementChoice(choice);

        System.out.println("Enter hourly rate ");
        temp = sc.nextLine();
        double hourlyRate = Double.parseDouble(temp);
        current.setHourlyRate(hourlyRate);

        current.setEmployeeType();

        return current;
    }


    public static SalariedEmployee getSalariedEmployeeObject(){

        SalariedEmployee current = new SalariedEmployee(); 
        
        System.out.println("New Salaried Employee to be created :- ");

        System.out.println("Enter name ");
        String name = sc.nextLine();
        current.setName(name);

        System.out.println("Enter joining date in YYYY-MM-DD format ");
        String temp = sc.nextLine();
        LocalDate joiningDate=LocalDate.parse(temp);
        current.setLastPaid(joiningDate);

        System.out.println("Payment Choice: ");
        System.out.println("Enter 1 for MAILED_TO_POSTAL_ADDRESS,2 for PICKUP_FROM_PAYMASTER,and 3 forDEPOSITED_TO_BANK_ACCOUNT");
        String chStr=sc.nextLine();
        int choice = Integer.parseInt(chStr);
        current.setPayementChoice(choice);

        System.out.println("Enter montly salary");
        String salaryStr=sc.nextLine();
        double flatSalary = Double.parseDouble(salaryStr);
        current.setFlatSalary(flatSalary);

        System.out.println("Enter commssion on sale (in percentage) ");
        String commissionStr=sc.nextLine();
        double commissionRate = Double.parseDouble(commissionStr);
        current.setCommissionRate(commissionRate);


        current.setEmployeeType();


        return current;
    }




    //interactive method to create new employee object
    public static Employee getEmployeeObject(){

        System.out.println("Enter 1 for hourly worker and 2 for salaried worker");
        int type=0;
        do{
            String temp = sc.nextLine();
            type= Integer.parseInt(temp);
        }while(type!=1 && type !=2);

        if(type == 1){
            return (Employee)getHourlyEmployeeObject();
        }
        else{
            return (Employee)getSalariedEmployeeObject();
        }


    }
 
}