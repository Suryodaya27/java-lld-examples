package library_management_system;

public class UserFactory {
    public User createUser(String name, String email, String designation){
        if(designation.equalsIgnoreCase("member")){
            return new Member(name, email, designation);
        }else if(designation.equalsIgnoreCase("librarian")){
            return new Librarian(name, email, designation);
        }
        return null;
    }
}
