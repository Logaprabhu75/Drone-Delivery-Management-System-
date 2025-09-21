// class for the drone 
public class Drone {
    private String droneId;
    private String status = "Available";
    public Drone(String droneId) {
        this.droneId = droneId;
    }
    public void assignorder(Order order) {
        status = "Not Available";
        System.out.println("The drone id  " + droneId + "  is assigned to order id  " + order.getOrderId());
    }
    // order status update
    public void updatestatus(String newStatus) {
        status = newStatus;
        System.out.println("Drone " + droneId + " status updated to " + status);
    }
}




