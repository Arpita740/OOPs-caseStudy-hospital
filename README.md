You are developing a Hospital Management System where the hospital has different types of employees, such as Doctors, Nurses, and Staff. Each employee has a unique employee ID, name, and salary, but the method to calculate the salary is different for each type of employee. Doctors have an additional consultation fee, nurses have an overtime bonus, and staff have a flat salary.

Requirements:
 Employee details like employeeId, name, and baseSalary must be encapsulated in a base class Employee.
 Create subclasses Doctor, Nurse, and Staff that inherit from Employee.
 Override a method calculateSalary() in each subclass to calculate the final salary based on specific conditions (consultation fee, overtime bonus, etc.).
 Make the Employee class abstract and enforce the implementation of the calculateSalary() method in the subclasses.
Questions:
Create an abstract Employee class with private fields and abstract methods.
Implement subclasses to calculate the specific salary for each type of employee.
Write a main class that creates instances of each type of employee and calculates their salaries
