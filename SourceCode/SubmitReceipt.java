package SourceCode;

import java.time.LocalDate;
import java.util.Scanner;
import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;
import SourceCode.models.Receipt;
import SourceCode.models.SalariedEmployee;

public class SubmitReceipt {
    public static EmployeeManager manager = ManagerFactory.getManagerObject();
    static Scanner sc= new Scanner(System.in);

    public static void submitReceipt(){
        System.out.println("Enter your Employee ID");
        String inputStr=sc.nextLine();
        int id=Integer.parseInt(inputStr);


        Employee temp = manager.findEmployee(id);
        if(temp==null){
            System.out.println("Invalid Employee ID");
        }
        else{
            String type=temp.getType();
            if("SalariedEmployee".equals(type)){
                SalariedEmployee current=(SalariedEmployee)temp;
                System.out.println("Submit Receipt detail to get commission:- ");

                LocalDate date;
                double ammount;
                
                System.out.println("Enter Date of transaction in YYYY-MM-DD format ");
                inputStr=sc.nextLine();
                date=LocalDate.parse(inputStr);

                System.out.println("Enter ammount of transaction ");
                inputStr=sc.nextLine();
                ammount=Double.parseDouble(inputStr);

                Receipt receipt=new Receipt(date,ammount);

                current.submitReceipt(receipt);

                System.out.println("Receipt Submitted !!!");

            }
            else{
                System.out.println("Only Salaried employee can get commission");

            }

        }

    }
        

    
}