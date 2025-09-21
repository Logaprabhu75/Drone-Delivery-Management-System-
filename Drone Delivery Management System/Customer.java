// class for customer
import java.util.*;
public class Customer extends User {
    private List<Order> orderHistory = new ArrayList<>();
    public Customer(int userId, String name) {
        super(userId, name);
    }
    //place order
    public Order placeorder(String address) {
        Order order = new Order(address);
        orderHistory.add(order);
        System.out.println("Order placed successfully and order id is " + order.getOrderId());
        return order;
    }
    //tracking of order
    public void trackorder(Order order) {
        System.out.println("the status of the order id  " + order.getOrderId() + "is" + order.getStatus());
    }
}




