public class Order {
    private static int counter = 1000; // starting order ID
    private String orderId;
    private String deliveryAddress;
    private String status = "Pending";

    public Order(String deliveryAddress) {
        this.orderId = "ORD" + counter; // e.g., ORD1000
        counter++;
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderId() { return orderId; }
    public String getStatus() { return status; }
    public void updateStatus(String newStatus) { status = newStatus; }
}
