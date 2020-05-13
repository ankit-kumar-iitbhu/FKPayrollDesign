package SourceCode.models;

import java.util.ArrayList;

import SourceCode.interfaces.UnionInterface;

public class InMemoryUnion implements UnionInterface {
    private static ArrayList<Employee> memberList=new ArrayList<>();

    @Override
    public ArrayList<Employee> getAllMember() {
        return memberList;
    }

    @Override
    public void collectServiceCharge(double serviceCharge) {
        for(Employee emp: memberList){
            String transactionDetail = "Deducting "+serviceCharge+" from "+emp.getId()+" for union service charge .";

            emp.deductFromBalance(serviceCharge);
        }
    }

    @Override
    public void addMember(Employee emp) {
        memberList.add(emp);
    }

    @Override
    public void removeMember(Employee emp) {
        memberList.remove(emp);
    }
    
}