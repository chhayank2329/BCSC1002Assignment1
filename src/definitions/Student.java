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

    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfTheBooksIssued = new Book[numberOfBooksIssued];
        for (int index = 0; index < namesOfTheBooksIssued.length; index++) {
            namesOfTheBooksIssued[index] = new Book("Book" + (index + 1), "Author" + (index + 1), "1234567891234");
        }
    }

    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued.clone();
    }

    public void setNamesOfTheBooksIssued(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }

    public void printNamesOfBooksIssued() {
        for (Book bookName : namesOfTheBooksIssued) {
            System.out.println(bookName);
        }
    }
}
