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


        } while (libraryDetails);

    }
}


