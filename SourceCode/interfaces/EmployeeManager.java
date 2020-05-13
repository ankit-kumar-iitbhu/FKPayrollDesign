package SourceCode.interfaces;

import SourceCode.models.Employee;

public interface EmployeeManager {
    public Employee findEmployee(int pk);
    public void addEmployee(Employee current);
    public void deleteEmployee(int pk);
    public void printAllEmployee();

}