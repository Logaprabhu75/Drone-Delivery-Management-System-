public class Drone {
    private String droneId;
    private String status = "Available";
    public Drone(String droneId) {
        this.droneId = droneId;
    }
    public void assignOrder(Order order) {
        status = "Not Available";
        System.out.println("Drone " + droneId + " assigned to order " + order.getOrderId());
    }
    public void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Drone " + droneId + " status updated to " + status);
    }
}


