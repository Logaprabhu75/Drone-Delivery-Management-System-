public class Order {
    private static int counter = 0;
    private String orderId;
    private String deliveryAddress;
    private String status = "Pending";
    public Order(String deliveryAddress) {
        this.orderId = "OrdId" + counter; 
        counter++;
        this.deliveryAddress = deliveryAddress;
    }
    public String getOrderId() { return orderId; }
    public String getStatus() { return status; }
    public void updateStatus(String newStatus) { status = newStatus; }
}

