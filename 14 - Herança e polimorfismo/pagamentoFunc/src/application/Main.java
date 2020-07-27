package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.println("Outsourced (y/n)?");
            char outsourced = in.next().charAt(0);
            in.nextLine();

            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Hours: ");
            int hours = in.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = in.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = in.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

            } else {
                employees.add(new Employee(name, hours, valuePerHour));
                
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");

        for (Employee emp : employees ) {
            System.out.println(emp);
        }

        in.close();
    }
}
