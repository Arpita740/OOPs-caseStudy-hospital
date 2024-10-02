package com.casestudy.a2.set1;
public class Doctor extends Employee {
    private double consultFee;

    public Doctor(int empId, String name, double salary, double consultFee) {
        super(empId, name, salary);
        this.consultFee = consultFee;
    }

    @Override
    public double calculateTotal() {
        return getSalary() + consultFee;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Consultation Fee: " + consultFee);
    }
}
