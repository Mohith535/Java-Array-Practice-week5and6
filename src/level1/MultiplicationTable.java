import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid number. Please enter a positive number.");
            System.exit(0);
        }

        // Create array to store results
        int[] table = new int[10];

        // Calculate multiplication table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display results
        System.out.println("\nMultiplication Table:");

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + table[i]);
        }

        // Close scanner
        input.close();
    }
}