package SourceCode;

import SourceCode.interfaces.EmployeeManager;

public class DeleteMember {
    public static EmployeeManager manager = ManagerFactory.getManagerObject();

    public static void deleteMember(int id){
        manager.deleteEmployee(id);
    }
}