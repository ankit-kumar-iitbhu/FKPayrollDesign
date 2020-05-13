package SourceCode;

import java.util.Scanner;

import SourceCode.interfaces.EmployeeManager;
import SourceCode.interfaces.UnionInterface;
import SourceCode.models.Employee;

public class UnionOperation {
    static UnionInterface unionObj= UnionFactory.getUnionObject();
    static EmployeeManager empManager= ManagerFactory.getManagerObject();

    static Scanner sc= new Scanner(System.in);


    public static void addMember(){
        System.out.println("Enter employee's id to be added to union:- ");
        String temp=sc.nextLine();
        int id=Integer.parseInt(temp);
        Employee emp=empManager.findEmployee(id);
        unionObj.addMember(emp);
    }

    public static void removeMember(){
        System.out.println("Enter employee's id to be removed to union:- ");
        String temp=sc.nextLine();
        int id=Integer.parseInt(temp);
        Employee emp=empManager.findEmployee(id);
        unionObj.removeMember(emp);
    }


    public static void chargeCharges(){
        System.out.println("Enter amount of Service/Membership charge :- ");
        String temp=sc.nextLine();
        int serviceCharge=Integer.parseInt(temp);
        unionObj.collectServiceCharge(serviceCharge);

    }



    public static void unionOperation(){
        System.out.println("Enter 1 to add a new member to union");
        System.out.println("Enter 2 to remove an existing member from union");
        System.out.println("Enter 3 to collect Service/Membership charge from all union member");

        System.out.println("Enter your choice:- ");
        String inputStr=sc.nextLine();
        int choice = Integer.parseInt(inputStr);

        if(choice == 1){
            addMember();
        }
        if(choice==2){
            removeMember();
        }
        if(choice==3){
            chargeCharges();
        }



    }

    
}