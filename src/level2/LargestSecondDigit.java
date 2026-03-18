import java.util.Scanner;

public class LargestSecondDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid number.");
            System.exit(0);
        }

        // Max size of digits
        int maxSize = 10;

        int[] digits = new int[maxSize];
        int index = 0;

        // Extract digits
        while (number != 0 && index < maxSize) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output
        System.out.println("\nLargest Digit = " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest digit found.");
        } else {
            System.out.println("Second Largest Digit = " + secondLargest);
        }

        input.close();
    }
}