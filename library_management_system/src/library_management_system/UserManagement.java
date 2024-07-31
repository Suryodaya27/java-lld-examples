package library_management_system;
import java.util.ArrayList;

import book_storage.BookManagement;

public class UserManagement {
    
    private ArrayList<User> users;
    private static UserManagement instance = null;
    private UserManagement() {
        users = new ArrayList<User>();
    }
    
    public static UserManagement getInstance() {
        if (instance == null) {
            instance = new UserManagement();
        }
        return instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    
    public void addUser(User user){
        users.add(user);
        BookManagement.getInstance().addObserver(user);
    }

    public void removeUser(User user){
        users.remove(user);
        BookManagement.getInstance().removeObserver(user);
    }

    public void displayUsers(){
        for(User user: users){
            System.out.println(user);
        }
    }


}
