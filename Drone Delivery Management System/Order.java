// class for orders
public class Order {
    private static int count = 0;
    private String orderId;
    private String deliveryAddress;
    private String status = "Pending";
    public Order(String deliveryAddress) {
        this.orderId = "OrdId" + count; 
        count++;
        this.deliveryAddress = deliveryAddress;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getStatus() {
        return status; 
    }
    public void updateStatus(String newStatus) { 
        status = newStatus; 
    }
}



