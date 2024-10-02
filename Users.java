package com.casestudy.a2.set1;
public class Users {

    public static void main(String[] args) {
        // Create instances of different employees
        Employee e1 = new Doctor(1, "Arpita", 50000, 1000);
        Employee e2 = new Nurse(2, "Uma", 40000, 1000);
        Employee e3 = new Staff(3, "Rishi", 25000);

        // Display and calculate salaries for Doctor
        System.out.println("Doctor's Details:");
        e1.display();
        System.out.println("Doctor's Salary : " + e1.calculateTotal() + " rs only.\n");

        // Display and calculate salaries for Nurse
        System.out.println("Nurse's Details:");
        e2.display();
        System.out.println("Nurse's Salary : " + e2.calculateTotal() + " rs only.\n");

        // Display and calculate salaries for Staff
        System.out.println("Staff's Details:");
        e3.display();
        System.out.println("Staff's Salary : " + e3.calculateTotal() + " rs only.\n");
    }
}
