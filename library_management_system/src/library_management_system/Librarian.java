package library_management_system;

public class Librarian extends User {

    private String librarianID;

    public Librarian(String name, String email, String designation) {
        super(name, email, designation);
        this.librarianID = "L" + (int) (Math.random() * 1000);
    }

    @Override
    public String getId() {
        return librarianID;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "librarianID='" + librarianID + '\'' +
                "} " + super.toString();
    }
    
}
