package SourceCode;

import java.util.Scanner;


import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;
import SourceCode.models.HourlyEmployee;
import SourceCode.models.SalariedEmployee;

public class EditEmployeeDetail {
    public static EmployeeManager empManager = ManagerFactory.getManagerObject();
    public static Scanner sc=new Scanner(System.in);

    public static void editEmployeeDetail(){

        System.out.println("Enter employee's id to be modified :- ");
        String temp=sc.nextLine();
        int id=Integer.parseInt(temp);
        Employee emp=empManager.findEmployee(id);
        if(emp == null ){
            System.out.println("Invalid employee id ");
        }
        else{
            System.out.println("Following employee will be modified :-");
            System.out.println(emp);
            System.out.println("enter modify employee details enter your choices :-");
            System.out.println("1 : Name                   2: FlatSalary/hourlyWage");
            System.out.println("3 : Dues Rate              4: Payement Choice ");

            temp=sc.nextLine();
            int choice=Integer.parseInt(temp);

            switch(choice){
                case 1:
                    System.out.println("Enter new name ");
                    String name = sc.nextLine();
                    emp.setName(name);
                break;

                case 2:
                    if(emp.getType()=="HourlyEmployee"){
                        HourlyEmployee h_emp=(HourlyEmployee)emp;
                        System.out.println("Enter new hourly rate ");
                        temp = sc.nextLine();
                        double hourlyRate = Double.parseDouble(temp);
                        h_emp.setHourlyRate(hourlyRate);
                    }
                    else{
                        SalariedEmployee s_emp=(SalariedEmployee)emp;
                        System.out.println("Enter new montly salary");
                        String salaryStr=sc.nextLine();
                        double flatSalary = Double.parseDouble(salaryStr);
                        s_emp.setFlatSalary(flatSalary);
                    }
                break;

                case 3:
                    System.out.println("Enter new dues rate");
                    String duesRateStr=sc.nextLine();
                    double duesRate = Double.parseDouble(duesRateStr);
                    emp.setDuesUnion(duesRate);
                break;

                case 4:
                    System.out.println("Payment Choice: ");
                    System.out.println("Enter 1 for MAILED_TO_POSTAL_ADDRESS,2 for PICKUP_FROM_PAYMASTER,and 3 forDEPOSITED_TO_BANK_ACCOUNT");
                    temp = sc.nextLine();
                    int ch = Integer.parseInt(temp);
                    emp.setPayementChoice(ch);
                break;

                default:
                System.out.println("Invalid Choice ");

            }
            
            System.out.println(emp);

        }
    }


}