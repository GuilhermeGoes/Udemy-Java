package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = in.nextLine();
        System.out.print("Email: ");
        String clientEmail = in.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(in.next());

        Client client = new Client(clientName, clientEmail, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = in.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.print("How many items to this order? ");
        int itemsQuantity = in.nextInt();
        for (int i = 1; i <= itemsQuantity; i++) {
            in.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = in.nextLine();
            System.out.print("Product price: ");
            double productPrice = in.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = in.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addOrderItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        in.close();
    }
}
