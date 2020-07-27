package application;

import com.sun.jdi.IntegerType;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = in.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = in.nextLine();
        System.out.print("Level: ");
        String workerLevel = in.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = in.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
                                    baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int quantityContracts = in.nextInt();

        for (int i = 1; i <= quantityContracts; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date Contractdate = spf.parse(in.next());
            System.out.print("Value per hour: ");
            double valuePerHour = in.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = in.nextInt();

            HourContract contract = new HourContract(Contractdate, valuePerHour, duration);
            worker.addContracts(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = in.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        in.close();
    }
}