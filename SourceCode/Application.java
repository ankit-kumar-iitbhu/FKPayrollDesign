package SourceCode;

import SourceCode.interfaces.EmployeeManager;

public class Application{

    public static void main(String[] args) {
        System.out.println("Welcome to Payroll Application ");
        System.out.println();
        System.out.println("Application is under construction ");

        EmployeeManager manager=ManagerFactory.getManagerObject();
        AddMember.addMember();
        manager.printAllEmployee();

        AddMember.addMember();

        EditEmployeeDetail.editEmployeeDetail();
        manager.printAllEmployee();
        EditEmployeeDetail.editEmployeeDetail();
        manager.printAllEmployee();
        EditEmployeeDetail.editEmployeeDetail();
        manager.printAllEmployee();

    }
}