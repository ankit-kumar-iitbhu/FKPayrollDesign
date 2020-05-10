package SourceCode;

import SourceCode.interfaces.EmployeeManager;

public class DeleteMember {
    public static EmployeeManager manager= new InMemoryManager();

    public static void deleteMember(int id){
        manager.deleteEmployee(id);
    }
}