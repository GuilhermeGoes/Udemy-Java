package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            in.nextLine();
            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = in.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Price: ");
            double price = in.nextDouble();

            if (cui == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = in.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
            else if (cui == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(in.next());
                products.add(new UsedProduct(name, price, manufactureDate));
            }
            else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }
    }
}
