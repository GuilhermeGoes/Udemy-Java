package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = in.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = in.nextDouble();
        System.out.print("Tax: ");
        employee.tax = in.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = in.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        in.close();
    }
}
