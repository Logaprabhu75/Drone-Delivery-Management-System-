public class Admin extends User {

    public Admin(int userId, String name) {
        super(userId, name);
    }

    public Drone registerDrone(String droneId) {
        System.out.println("Drone registered: " + droneId);
        return new Drone(droneId);
    }

    public void assignDrone(Drone drone, Order order) {
        drone.assignOrder(order);
        order.updateStatus("Assigned");
    }
}
