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
    }
}
