package SourceCode.interfaces;

import SourceCode.models.Employee;

public interface EmployeeManager {
    public Employee findEmployee(int pk);
    public void addEmployee();
    public void deleteEmployee();

}