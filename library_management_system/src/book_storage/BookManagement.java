package book_storage;

import java.util.ArrayList;


public class BookManagement implements Subject{
    private ArrayList<Book> books;
    private ArrayList<Observer> observers;
    private static BookManagement instance = null;
    private BookManagement() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }
    
    public static BookManagement getInstance() {
        if (instance == null) {
            instance = new BookManagement();
        }
        return instance;
    }
     
    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObserver(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    public Book addBook(String title, String author, int year, int copies) {
        Book book = new Book(title, author, year, copies);
        books.add(book);
        notifyObserver(book);
        return book;
    }

    public void removeBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
