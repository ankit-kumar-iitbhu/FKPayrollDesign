package SourceCode;

import SourceCode.interfaces.EmployeeManager;

public class ManagerFactory {
    public static EmployeeManager manager = new InMemoryManager();

    public static EmployeeManager getManagerObject(){
        return manager;
    }

}