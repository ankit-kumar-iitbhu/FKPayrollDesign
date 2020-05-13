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
        int choice = sc.nextInt();
        current.setPayementChoice(choice);

        System.out.println("Enter hourly rate ");
        double hourlyRate = sc.nextDouble();
        current.setHourlyRate(hourlyRate);

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
        int choice = sc.nextInt();
        current.setPayementChoice(choice);

        System.out.println("Enter montly salary");
        double flatSalary = sc.nextDouble();
        current.setFlatSalary(flatSalary);

        System.out.println("Enter commssion on sale (in percentage) ");
        double commissionRate = sc.nextDouble();
        current.setCommissionRate(commissionRate);



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