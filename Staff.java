package com.casestudy.a2.set1;
public class Staff extends Employee {

    public Staff(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    @Override
    public double calculateTotal() {
        return getSalary();
    }

    @Override
    public void display() {
        super.display();
    }
}
