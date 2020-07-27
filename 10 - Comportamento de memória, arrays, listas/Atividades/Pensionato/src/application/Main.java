package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Rent vect[] = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");

            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Email: ");
            String email = in.nextLine();
            System.out.print("Room: ");
            int room = in.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for(int i=0; i<vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        in.close();
    }
}
