import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 3
 * Topic: Variables, Data Types, Expressions and Input/Output
 * File: SimpleCalculator.java
 *
 * Description:
 * Reads two floating-point numbers from standard input and computes
 * their sum, difference, product, and quotient. Division by zero is
 * safely caught and handled before any division operation takes place.
 * All numeric outputs are formatted to two decimal places.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("          COS 201: SIMPLE CALCULATOR              ");
        System.out.println("==================================================");

        // Input first number
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Arithmetic calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display results formatted to two decimal places
        System.out.println("\n--------------------------------------------------");
        System.out.println("                  CALCULATION RESULTS             ");
        System.out.println("--------------------------------------------------");
        System.out.printf("First Number : %.2f%n", firstNumber);
        System.out.printf("Second Number: %.2f%n", secondNumber);
        System.out.printf("Sum          : %.2f%n", sum);
        System.out.printf("Difference   : %.2f%n", difference);
        System.out.printf("Product      : %.2f%n", product);

        // Defensive check: handle zero divisor safely
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient     : %.2f%n", quotient);
        } else {
            System.out.println("Quotient     : Division is undefined for a zero divisor.");
        }
        System.out.println("==================================================");

        input.close();
    }
}
