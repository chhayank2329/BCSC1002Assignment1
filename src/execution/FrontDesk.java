/*  Created by IntelliJ IDEA.
 *  User: Chhayank Sharma
 *  Date: 30/08/20
 *  Time: 8:23 PM
 *  File Name : FrontDesk.java
 * */
package execution;

public class FrontDesk {
    public static void main(String[] args) {
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("Issue a new book for me.");
        System.out.println("Return a previously issues book for me.");
        System.out.println("Show me all my issues books");
        System.out.println("Exit.");
    }
}

class Library {
    void add() {
        System.out.println("Enter Book Name,Amount,ISBN Number");
    }

}
