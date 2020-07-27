package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Student student = new Student();

        student.name = in.nextLine();
        student.grade1 = in.nextDouble();
        student.grade2 = in.nextDouble();
        student.grade3 = in.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() > 60)
            System.out.println("PASS");
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
        }

        in.close();
    }
}
