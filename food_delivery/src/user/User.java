package user;

public class User implements Observer {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(" ");
        System.out.println("Notification for " + name + ": " + message);    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + "]";
    }
}
