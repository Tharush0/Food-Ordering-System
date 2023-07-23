/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Order.Order;
import foododersystem.FoodOrderSystem;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Customer {

    private Scanner scanner = new Scanner(System.in);

   public void placeOrder() {
        String name;
        String address;
        double totalBill = 0.00;
        boolean orderAnother = true;

        System.out.println("Welcome, Customer!");

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your address:");
        address = scanner.nextLine();

        while (orderAnother) {
            System.out.println("\n---------- Order Food Item ----------");
            FoodOrderSystem.displayMenu();

            System.out.println("Enter the item number to order (0 to exit):");
            int itemNumber = scanner.nextInt();
            scanner.nextLine();

            if (itemNumber == 0) {
                orderAnother = false;
            } else if (itemNumber >= 1 && itemNumber <= 10) {
                System.out.println("Enter the quantity:");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                double itemPrice = FoodOrderSystem.getItemPrice(itemNumber);
                double itemTotal = itemPrice * quantity;

                totalBill += itemTotal;

                System.out.println("Item added to the order successfully!");
                System.out.println("Item Total: $" + itemTotal);

                System.out.println("Do you want to order another food item? (Y/N)");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("N")) {
                    orderAnother = false;
                }
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
        }

        System.out.println("Order placed successfully!");
        System.out.println("Total Bill Amount: $" + totalBill);

        Order order = new Order(name, address, totalBill);
        FoodOrderSystem.addToOrderQueue(order);
    }
}
