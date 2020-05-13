package SourceCode;

import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;

public class AddMember {
    public static EmployeeManager manager = ManagerFactory.getManagerObject();

    public static void addMember(){
        Employee temp=GetEmployeeObject.getEmployeeObject();
        if(temp == null){
            System.out.println("Operation Failed !!!");
        }
        else{
            manager.addEmployee(temp);
        }
    }

}