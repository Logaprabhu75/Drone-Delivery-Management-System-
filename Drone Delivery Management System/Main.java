public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(1, "Admin");
        Customer customer = new Customer(101, "Vicky");
        admin.login();
        customer.login();
        Drone drone1 = admin.registerDrone("d075");
        Order order1 = customer.placeOrder("19,raja street chettipalayam-641201");
        admin.assignDrone(drone1, order1);
        customer.trackOrder(order1);
        drone1.updateStatus("Delivered");
        customer.trackOrder(order1);
        admin.logout();
        customer.logout();
    }
}

    


