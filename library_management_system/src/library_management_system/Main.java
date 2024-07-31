package library_management_system;

import book_storage.*;

public class Main{
    public static void main(String[] args){

        UserFactory userFactory = new UserFactory();
        UserManagement userManagement = UserManagement.getInstance();
        User user1 = userFactory.createUser("John Doe", "john@gmail.com","Member");
        userManagement.addUser(user1);
        User user2 = userFactory.createUser("Jane Doe", "jane@gmail.com","Librarian");
        userManagement.addUser(user2);
        userManagement.displayUsers();

        

        BookManagement bookManagement = BookManagement.getInstance();
        bookManagement.addBook("The Alchemist", "Paulo Coelho", 1988, 5);
        bookManagement.addBook("The Da Vinci Code", "Dan Brown", 2003, 3);

        bookManagement.displayBooks();

        BookTransaction bookTransaction = new BookTransaction();

        bookTransaction.issueBook("The Alchemist", user1.getId());
        bookTransaction.issueBook("The Alchemist", "M2");
        bookTransaction.issueBook("The Alchemist", user2.getId());
        bookTransaction.issueBook("The Alchemist", user1.getId());

        bookManagement.displayBooks();

        bookTransaction.issueBook("The Alchemist", user1.getId());
        bookTransaction.issueBook("The Alchemist", user1.getId());
        bookTransaction.returnBook("The Alchemist", "M1");
        bookTransaction.returnBook("The Alchemist", user1.getId());


        bookManagement.displayBooks();
    }
}
