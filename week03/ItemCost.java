import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 3
 * Topic: Variables, Data Types, Expressions and Input/Output
 * File: ItemCost.java
 *
 * Description:
 * A simple inventory item cost calculator that prompts for an item description,
 * quantity (integer), and unit price (floating-point). It defensively validates
 * that quantity is strictly positive and unit price is non-negative before
 * computing and displaying the purchase summary formatted to two decimal places.
 */
public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("           COS 201: ITEM COST CALCULATOR          ");
        System.out.println("==================================================");

        // Prompt for item name
        System.out.print("Enter item name: ");
        String itemName = input.nextLine().trim();

        // Prompt and validate quantity (must be positive integer > 0)
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        while (quantity <= 0) {
            System.out.print("Invalid quantity! Must be greater than 0. Re-enter quantity: ");
            quantity = input.nextInt();
        }

        // Prompt and validate unit price (must be non-negative >= 0.0)
        System.out.print("Enter unit price (NGN): ");
        double unitPrice = input.nextDouble();
        while (unitPrice < 0.0) {
            System.out.print("Invalid price! Cannot be negative. Re-enter unit price: ");
            unitPrice = input.nextDouble();
        }

        // Calculate total cost
        double totalCost = quantity * unitPrice;

        // Display purchase summary formatted to 2 decimal places
        System.out.println("\n--------------------------------------------------");
        System.out.println("                 PURCHASE SUMMARY                 ");
        System.out.println("--------------------------------------------------");
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Unit Price : NGN %.2f%n", unitPrice);
        System.out.printf("Total Cost : NGN %.2f%n", totalCost);
        System.out.println("==================================================");

        input.close();
    }
}
