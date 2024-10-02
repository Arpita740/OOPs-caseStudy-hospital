package com.casestudy.a2.set1;

abstract public class Employee {
private  int empId;
private  String name;
private  double salary;
public Employee(int empId, String name, double salary) {
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}

public String getName() {
	return name;
}

public double getSalary() {
	return salary;
}
public void display() {
    System.out.println("Employee ID: " + empId + ", Name: " + name + ", Base Salary: " + salary);
}
abstract public double calculateTotal();
}

