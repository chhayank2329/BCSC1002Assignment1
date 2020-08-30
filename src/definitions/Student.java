/*  Created by IntelliJ IDEA.
 *  User: Chhayank Sharma
 *  Date: 30/08/20
 *  Time: 8:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheStudent='" + nameOfTheStudent + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", namesOfTheBooksIssued=" + Arrays.toString(namesOfTheBooksIssued) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(nameOfTheStudent, student.nameOfTheStudent) &&
                Arrays.equals(namesOfTheBooksIssued, student.namesOfTheBooksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameOfTheStudent, universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(namesOfTheBooksIssued);
        return result;
    }
}

