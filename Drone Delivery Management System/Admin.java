// class for admin
public class Admin extends User {
    public Admin(int userId, String name) {
        super(userId, name);
    }
    //drone register
    public Drone registerdrone(String droneId) {
        System.out.println("Drone registered and id is" + droneId);
        return new Drone(droneId);
    }
    //drone assigning 
    public void assigndrone(Drone drone, Order order) {
        drone.assignorder(order);
        order.updateStatus("drone is assigned successfully ");
    }
}







