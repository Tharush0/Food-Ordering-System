package foododersystem;

import Customer.Customer;
import Employee.Employee;
import Order.Order;
import Order.OrderQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FoodOrderSystem {

    private static Scanner scanner = new Scanner(System.in);
    private static OrderQueue orderQueue = new OrderQueue();

    public static void main(String[] args) {
        System.out.println("Welcome to the Food Order System!");

        while (true) {
            System.out.println("\nAre you a customer or an employee?");
            System.out.println("1. Customer");
            System.out.println("2. Employee");
            System.out.println("0. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    while (true) {
                        System.out.println("\n---------- Customer Mode ----------");
                        System.out.println("Select an option:");
                        System.out.println("1. Place an order");
                        System.out.println("0. Back to main menu");

                        int customerOption = scanner.nextInt();
                        scanner.nextLine();

                        if (customerOption == 0) {
                            break;
                        } else if (customerOption == 1) {
                            Customer customer = new Customer();
                            customer.placeOrder();
                        } else {
                            System.out.println("Invalid option. Please try again.");
                        }
                    }
                    break;
                case 2:
                    Employee employee = new Employee();
                    employee.processOrders();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    public static void addToOrderQueue(Order order) {
        orderQueue.enqueueOrder(order);
    }

    public static Order getNextOrder() {
        return (Order) orderQueue.dequeueOrder();
    }

    public static boolean hasPendingOrders() {
        return orderQueue.hasPendingOrders();
    }

    public static void displayMenu() {
        System.out.println("--------- Menu ---------");
        System.out.println("1. Item 1 - Rs100.00");
        System.out.println("2. Item 2 - Rs150.00");
        System.out.println("3. Item 3 - Rs120.00");
        System.out.println("4. Item 4 - Rs180.00");
        System.out.println("5. Item 5 - Rs200.00");
        System.out.println("6. Item 6 - Rs260.00");
        System.out.println("7. Item 7 - Rs300.00");
        System.out.println("8. Item 8 - Rs250.00");
        System.out.println("9. Item 9 - Rs400.00");
        System.out.println("10. Item 10 - Rs800.00");
        System.out.println("0. Exit");
    }

   public static double getItemPrice(int itemNumber) {
        switch (itemNumber) {
            case 1:
                return 100.00;
            case 2:
                return 150.00;
            case 3:
                return 120.00;
            case 4:
                return 180.00;
            case 5:
                return 200.00;
            case 6:
                return 260.00;
            case 7:
                return 300.00;
            case 8:
                return 250.00;
            case 9:
                return 400.00;
            case 10:
                return 800.00;
            default:
                return 0.00;
        }
    }

}
