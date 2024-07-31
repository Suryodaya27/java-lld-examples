package book_storage;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(Book book);
}
