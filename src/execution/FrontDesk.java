/*  Created by IntelliJ IDEA.
 *  User: Chhayank Sharma
 *  Date: 30/08/20
 *  Time: 8:50 PM
 *  File Name : Library.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your details : ");
        System.out.println("Name Of Student: ");
        String nameOfTheStudent = scanner.nextLine();
        System.out.println("University RollNo of Students: ");
        long universityRollNumberOfStudent = scanner.nextLong();
        System.out.println("Number of books issued: ");
        int numberOfBooksIssuedByStudent = scanner.nextInt();
        Student studentDetails = new Student(nameOfTheStudent, universityRollNumberOfStudent, numberOfBooksIssuedByStudent);
        Library libraryDetails = new Library();
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            System.out.println("Enter Your Choice (1...4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case 1 -> {
                    libraryDetails.getCurrentlyAvailableBooks();
                    System.out.println("Enter the name of the book you want to issue from the currently available books: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.println("You have successfully issued " + bookName + " book.");
                    studentDetails.setNumberOfBooksIssued(studentDetails.getNumberOfBooksIssued() + 1);
                }
                case 2 -> {
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.println("You have successfully returned " + bookName + " book.");
                    studentDetails.setNumberOfBooksIssued(studentDetails.getNumberOfBooksIssued() - 1);
                }
                case 3 -> {
                    System.out.println("Number Of Books Issued By You Currently ---> " + studentDetails.getNumberOfBooksIssued());
                    System.out.println("Names of Book Issued By You Up Till Now ---> ");
                    studentDetails.printNamesOfBooksIssued();
                }
                case 4 -> System.out.println("Thank You!");
                default -> System.out.println("Wrong Choice");
            }
        } while (studentInput != 4);
        scanner.close();
    }
}


