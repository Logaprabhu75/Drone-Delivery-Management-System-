public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(5, "Admin");
        Customer customer = new Customer(8, "Vicky");
        admin.login();
        customer.login();
        Drone drone1 = admin.registerdrone("OrdId075");
        Order order1 = customer.placeorder("19,raja street chettipalayam-641201");
        admin.assigndrone(drone1, order1);
        customer.trackorder(order1);
        drone1.updatestatus("Delivered");
        customer.trackorder(order1);
        admin.logout();
        customer.logout();
    }
}

    





