package SourceCode;

import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;

public class AddMember {
    public static EmployeeManager manager = new InMemoryManager();

    public static void addMember(){
        Employee temp=GetEmployeeObject.getEmployeeObject();
        manager.addEmployee(temp);
    }

}