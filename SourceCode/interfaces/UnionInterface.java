package SourceCode.interfaces;

import java.util.ArrayList;

import SourceCode.models.Employee;

public interface UnionInterface {
    ArrayList<Employee> getAllMember();
    void collectServiceCharge(double serviceCharge);
    void addMember(Employee emp);
    void removeMember(Employee emp);
}