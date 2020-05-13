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
        String inputStr=sc.nextLine();
        int id=Integer.parseInt(inputStr);

        Employee temp = manager.findEmployee(id);
        if(temp==null){
            System.out.println("Invalid Employee ID");
        }
        else{
            String type=temp.getType();
            if("HourlyEmployee".equals(type)){
                HourlyEmployee current=(HourlyEmployee)temp;
                inputStr=sc.nextLine();
                double noOfHours=Double.parseDouble(inputStr);
                current.postTimeCard(noOfHours);
            }
            else{
                System.out.println("Only Hourly paid worker on post time card");

            }

        }

    }

}