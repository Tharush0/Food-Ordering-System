
package Order;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {

    private Queue<Order> orderQueue = new LinkedList<>();

    public void enqueueOrder(Order order) {
        orderQueue.offer(order);
    }

    public Order dequeueOrder() {
        return orderQueue.poll();
    }

    public boolean hasPendingOrders() {
        return !orderQueue.isEmpty();
    }
}


