public class Admin extends User {
    public Admin(int userId, String name) {
        super(userId, name);
    }
    public Drone registerdrone(String droneId) {
        System.out.println("Drone registered and id is" + droneId);
        return new Drone(droneId);
    }
    public void assigndrone(Drone drone, Order order) {
        drone.assignorder(order);
        order.updateStatus("drone is assigned successfully ");
    }
}






