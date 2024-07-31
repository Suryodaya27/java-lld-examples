package book_storage;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private int copies;

    Book(String title, String author, int year, int copies) {
        this.id = "B"+ (int)(Math.random()*1000);
        this.title = title;
        this.author = author;
        this.year = year;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", copies=" + copies +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

}
