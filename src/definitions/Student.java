/*  Created by IntelliJ IDEA.
 *  User: Chhayank Sharma
 *  Date: 30/08/20
 *  Time: 8:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Student {
    private final String nameOfTheStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfTheBooksIssued;

    public Student(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }
}
