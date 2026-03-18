import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid number.");
            System.exit(0);
        }

        // Array to store frequency of digits (0–9)
        int[] frequency = new int[10];

        // Extract digits and count frequency
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number = number / 10;
        }

        // Display result
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " → " + frequency[i] + " times");
            }
        }

        input.close();
    }
}