package oop.class_problems;

import java.util.Scanner;

public class Employee {

    String id;
    double salary;

    Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void printSalary() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
 }
