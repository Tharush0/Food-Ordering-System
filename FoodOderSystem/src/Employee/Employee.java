
package Employee;

import Order.Order;
import foododersystem.FoodOrderSystem;


public class Employee {

   public void processOrders() {
        System.out.println("\n---------- Employee Mode ----------");

        while (FoodOrderSystem.hasPendingOrders()) {
            Order order = FoodOrderSystem.getNextOrder();
            System.out.println("Processing order for: " + order.getName());

            System.out.println("Customer Name: " + order.getName());
            System.out.println("Address: " + order.getAddress());
            System.out.println("Total Bill: RS" + order.getTotalBill());
            System.out.println("Sending bill to: " + order.getAddress());
            System.out.println("Order processed successfully!\n");
        }

        System.out.println("No more orders in the queue.");
    }
}
