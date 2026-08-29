 package oop.class_problems;

 import java.util.Scanner;

 class Employee {
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
  


     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         Employee[] employees = {
             new Employee("E-101", 40000),
             new Employee("E-102", 55000),
             new Employee("E-103", 62000),
             new Employee("E-104", 48000)
         };

         System.out.print("Enter bonus amount: ");
         double bonus = scanner.nextDouble();

         for (int i = 0; i < 4; i++) {
             employees[i].raiseSalary(bonus);
         }

         for (int i = 0; i < 4; i++) {
             employees[i].printSalary();
         }

         scanner.close();
     }
     }
