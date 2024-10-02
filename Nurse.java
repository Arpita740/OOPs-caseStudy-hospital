package com.casestudy.a2.set1;
public class Nurse extends Employee {
    private double overTimeBonus;

    public Nurse(int empId, String name, double salary, double overTimeBonus) {
        super(empId, name, salary);
        this.overTimeBonus = overTimeBonus;
    }

    @Override
    public double calculateTotal() {
        return getSalary() + overTimeBonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overtime Bonus: " + overTimeBonus);
    }
}
