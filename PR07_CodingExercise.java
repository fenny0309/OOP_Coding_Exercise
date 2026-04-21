/*
Aim:
Create an Employee class with private instance variables for employeeName (String) and
employeeSalary (double). Implement public methods readEmployeeData() (to take input from the
user) and displayEmployeeData() (to print the employee's name and salary). Demonstrate object
creation and method invocation in a main method.
*/

import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(Scanner sc) {
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name = " + employeeName);
        System.out.println("Employee Salary = " + employeeSalary);
    }
}

public class PR07_CodingExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();   

        emp.readEmployeeData(sc);        
        emp.displayEmployeeData();     

        sc.close();
    }
}

/*
Output:
Enter employee name: Rahul
Enter employee salary: 30000
Employee Name = Rahul
Employee Salary = 30000.0
*/