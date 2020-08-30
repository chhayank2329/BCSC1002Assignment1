/*  Created by IntelliJ IDEA.
 *  User: Chhayank Sharma
 *  Date: 30/08/20
 *  Time: 8:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Library() {
        this.currentlyAvailableBooks = getCurrentlyAvailableBooks();
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }


}
