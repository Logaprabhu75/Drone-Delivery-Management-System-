import java.util.*;

public class Customer extends User {
    private List<Order> orderHistory = new ArrayList<>();

    // ✅ Constructor matches Main.java (int id, String name)
    public Customer(int userId, String name) {
        super(userId, name);
    }

    // ✅ Method to place an order
    public Order placeOrder(String address) {
        Order order = new Order(address);
        orderHistory.add(order);
        System.out.println("Order placed: " + order.getOrderId());
        return order;
    }

    // ✅ Method to track an order
    public void trackOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " status: " + order.getStatus());
    }
}
