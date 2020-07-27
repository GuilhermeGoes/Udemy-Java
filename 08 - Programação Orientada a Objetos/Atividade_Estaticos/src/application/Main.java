package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.printf("What is the dollar price? %.2f%n", CurrencyConverter.DOLAR);

        System.out.println("How many dollars will be bought? ");
        double valor = in.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n ", CurrencyConverter.converter(valor));

        in.close();
    }
}
