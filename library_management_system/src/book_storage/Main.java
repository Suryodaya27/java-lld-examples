package book_storage;

public class Main {
    public static void main(String[] args){
        
        BookManagement bookManagement = BookManagement.getInstance();
        bookManagement.addBook("The Alchemist", "Paulo Coelho", 1988, 5);
        bookManagement.addBook("The Da Vinci Code", "Dan Brown", 2003, 3);

        bookManagement.displayBooks();

        BookTransaction bookTransaction = new BookTransaction();

        bookTransaction.issueBook("The Alchemist", "M659");
        bookTransaction.issueBook("The Alchemist", "M659");
        bookTransaction.issueBook("The Alchemist", "M659");
        bookTransaction.issueBook("The Alchemist", "M659");

        bookManagement.displayBooks();

        // bookTransaction.issueBook("The Alchemist", "M5");
        // bookTransaction.issueBook("The Alchemist", "M5");
        // bookTransaction.returnBook("The Alchemist", "M1");
        // bookTransaction.returnBook("The Alchemist", "M2");


        bookManagement.displayBooks();
    }
}
