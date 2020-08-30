package definitions;


public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }
}

