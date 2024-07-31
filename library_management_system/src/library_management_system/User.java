package library_management_system;
import book_storage.*;

public abstract class User implements Observer{
    private String name;
    private String email;
    private String designation;


    public User(String name, String email, String designation) {
        this.name = name;
        this.email = email;
        this.designation = designation;
    }

    public abstract String getId();

    @Override
    public void update(Book book){
        System.out.println(this.name + "New book has been added "+ book);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
