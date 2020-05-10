package SourceCode;

import SourceCode.interfaces.EmployeeManager;
import SourceCode.models.Employee;
import java.util.ArrayList;

//this class is for test purpose
//it will be replaced with persistent alternative
public class InMemoryManager implements EmployeeManager {

    private ArrayList<? super Employee> employeeList;


    @Override
    public Employee findEmployee(int pk) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addEmployee() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteEmployee() {
        // TODO Auto-generated method stub

    }


}