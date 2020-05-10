package SourceCode;

import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;
import java.util.ArrayList;

//this class is for test purpose
//it will be replaced with persistent alternative
public class InMemoryManager implements EmployeeManager {

    private ArrayList<Employee> employeeList;


    @Override
    public Employee findEmployee(int pk) {
        if(pk<0&&pk>=employeeList.size()){
            System.out.println("Employee does not exist ");
            return null;
        }
        else return employeeList.get(pk);
    }

    @Override
    public void addEmployee(Employee temp) {
        // TODO Auto-generated method stub
        employeeList.add(temp);
    }

    @Override
    public void deleteEmployee(int pk) {
        // if employee exist it reference is changed to null
        Employee temp=findEmployee(pk);
        if(temp!=null){
            employeeList.set(pk,null);
        }
        else{
            System.out.println("Employee does not exist ");
        }
    }


}