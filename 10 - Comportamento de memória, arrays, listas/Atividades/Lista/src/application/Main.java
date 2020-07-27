package application;

import entities.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = in.nextInt();

        List<Employee> listEmployee = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + ":");

            int id;
            boolean verif = false;
            do {
                System.out.print("Id: ");
                id = in.nextInt();
                verif = idExists(id, listEmployee);

                if (verif == true) {
                    System.out.println("The Id already exists");
                }

            } while(verif == true);

            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Salary: ");
            double salary = in.nextDouble();

            listEmployee.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int findId = in.nextInt();

        Employee employee = listEmployee.stream().filter( x -> x.getId() == findId)
                                                .findFirst()
                                                .orElse(null);

        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = in.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee emp : listEmployee) {
            System.out.println(emp);
        }

        in.close();
    }

    public static boolean idExists (int id, List<Employee> listEmployee) {

        Employee employee = listEmployee.stream().filter( x -> x.getId() == id)
                                                                .findFirst()
                                                                .orElse(null);
        return  employee != null;
    }

}
