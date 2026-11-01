import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 3
 * Topic: Variables, Data Types, Expressions and Input/Output
 * File: AverageCalculator.java
 *
 * Description:
 * An interactive student grade calculator that prompts for a student's name
 * and three academic course scores. It implements defensive input validation
 * ensuring each score falls strictly between 0 and 100 before computing
 * the total score and average using floating-point arithmetic.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("       COS 201: STUDENT AVERAGE CALCULATOR        ");
        System.out.println("==================================================");

        // Prompt for student name
        System.out.print("Enter student name: ");
        String studentName = input.nextLine().trim();

        // Prompt and validate score 1
        System.out.print("Enter score for Course 1 (0 - 100): ");
        double score1 = input.nextDouble();
        while (score1 < 0.0 || score1 > 100.0) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 1: ");
            score1 = input.nextDouble();
        }

        // Prompt and validate score 2
        System.out.print("Enter score for Course 2 (0 - 100): ");
        double score2 = input.nextDouble();
        while (score2 < 0.0 || score2 > 100.0) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 2: ");
            score2 = input.nextDouble();
        }

        // Prompt and validate score 3
        System.out.print("Enter score for Course 3 (0 - 100): ");
        double score3 = input.nextDouble();
        while (score3 < 0.0 || score3 > 100.0) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 3: ");
            score3 = input.nextDouble();
        }

        // Calculate total and floating-point average
        double total = score1 + score2 + score3;
        double average = total / 3.0;

        // Display results formatted to two decimal places
        System.out.println("\n--------------------------------------------------");
        System.out.println("                 ACADEMIC RESULT CARD             ");
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name : " + studentName);
        System.out.printf("Course 1     : %.2f%n", score1);
        System.out.printf("Course 2     : %.2f%n", score2);
        System.out.printf("Course 3     : %.2f%n", score3);
        System.out.printf("Total Score  : %.2f / 300.00%n", total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("==================================================");

        input.close();
    }
}
