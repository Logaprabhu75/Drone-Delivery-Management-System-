public class User {
    protected int userId;
    protected String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void login() {
        System.out.println(name + "  you have logged in successfully.");
    }

    public void logout() {
        System.out.println(name + " you havelogged out successfully.");
    }
} 
    

