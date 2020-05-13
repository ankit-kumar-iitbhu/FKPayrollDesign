package SourceCode;

import java.util.Scanner;

import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;
import SourceCode.models.HourlyEmployee;

public class PostTimeCard {
    static Scanner sc =new Scanner(System.in);
    public static EmployeeManager manager = ManagerFactory.getManagerObject();

    public static void postTimeCard(){
        System.out.println("Enter your Employee ID");
        int id=sc.nextInt();

        Employee temp = manager.findEmployee(id);
        if(temp==null){
            System.out.println("Invalid Employee ID");
        }
        else{
            String type=temp.getType();
            if("HourlyEmployee".equals(type)){
                HourlyEmployee current=(HourlyEmployee)temp;
                double noOfHours=sc.nextDouble();
                current.postTimeCard(noOfHours);
            }
            else{
                System.out.println("Only Hourly paid worker on post time card");

            }

        }

    }

}