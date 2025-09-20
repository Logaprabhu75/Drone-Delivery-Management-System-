import java.util.*;
public class Customer extends User {
    private List<Order> orderHistory = new ArrayList<>();
    public Customer(int userId, String name) {
        super(userId, name);
    }
    public Order placeOrder(String address) {
        Order order = new Order(address);
        orderHistory.add(order);
        System.out.println("Order placed: " + order.getOrderId());
        return order;
    }
    public void trackOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " status: " + order.getStatus());
    }
}

