package book_storage;
import java.util.ArrayList;
import library_management_system.*;

public class BookTransaction {
    BookManagement bookManagement = BookManagement.getInstance();  
    private ArrayList<Book> books = bookManagement.getBooks();
    UserManagement userManagement = UserManagement.getInstance();

    private ArrayList<User> users = userManagement.getUsers();


    public void issueBook(String bookTitle, String memberID) {
        boolean isMember = false;
        for(User user : users) {
            if(user instanceof Member) {
                Member member = (Member) user;
                if(member.getMemberID().equals(memberID)) {
                    isMember = true;
                    break;
                }
            }
        }
        if(!isMember) {
            System.out.println("Member not found");
            return;
        }
        System.out.println("Issuing book");

        for(Book book : books) {
            System.out.println(book.getTitle());
            System.out.println(bookTitle);
            if(book.getTitle().equals(bookTitle)) {
                if(book.getCopies() > 0) {
                    book.setCopies(book.getCopies() - 1);
                    System.out.println("Book issued to member with ID: " + memberID);
                    return;
                }
                else{
                    System.out.println("Book not available");
                    return;
                }
            }
        }
    }

    public void returnBook(String bookTitle, String memberID) {
        boolean isMember = false;
        for(User user : users) {
            if(user instanceof Member) {
                Member member = (Member) user;
                if(member.getMemberID().equals(memberID)) {
                    isMember = true;
                    break;
                }
            }
        }
        if(!isMember) {
            System.out.println("Member not found");
            return;
        }
        for(Book book : books) {
            if(book.getTitle().equals(bookTitle)) {
                book.setCopies(book.getCopies() + 1);
                System.out.println("Book returned by member with ID: " + memberID);
                return;
            }
        }
    }

}
