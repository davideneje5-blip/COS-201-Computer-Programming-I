import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 2
 * Topic: Development Environment and First Java Program
 * File: StudentProfile.java
 *
 * Description:
 * An interactive console program that prompts the student to enter their
 * personal academic details (Full Name, Matriculation Number, Programme of Study,
 * and Course Code) and displays them in a structured student profile card.
 */
public class StudentProfile {

    public static void main(String[] args) {
        // Initialize Scanner object for reading keyboard input
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("          COS 201: STUDENT PROFILE SETUP          ");
        System.out.println("==================================================");

        // Prompt and read student inputs
        System.out.print("Enter your Full Name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Enter your Matriculation Number: ");
        String matricNumber = scanner.nextLine().trim();

        System.out.print("Enter your Programme of Study: ");
        String programme = scanner.nextLine().trim();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine().trim();

        // Display the collected information in a clean, professional profile
        System.out.println("\n--------------------------------------------------");
        System.out.println("             OFFICIAL STUDENT PROFILE             ");
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name : " + fullName);
        System.out.println("Matric Number: " + matricNumber);
        System.out.println("Programme    : " + programme);
        System.out.println("Course Code  : " + courseCode);
        System.out.println("Status       : Active Enrollment");
        System.out.println("==================================================");

        // Close scanner resource
        scanner.close();
    }
}
