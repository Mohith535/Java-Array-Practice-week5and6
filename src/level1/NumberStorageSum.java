import java.util.Scanner;

public class NumberStorageSum {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Array to store max 10 numbers
        double[] numbers = new double[10];

        // Variable to track index
        int index = 0;

        // Variable to store sum
        double total = 0.0;

        System.out.println("Enter numbers (0 or negative to stop):");

        // Infinite loop
        while (true) {

            System.out.print("Enter number: ");
            double num = input.nextDouble();

            // Stop condition
            if (num <= 0) {
                break;
            }

            // Check array limit
            if (index == numbers.length) {
                System.out.println("Array limit reached.");
                break;
            }

            // Store value
            numbers[index] = num;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nStored Numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("\nTotal Sum = " + total);

        // Close scanner
        input.close();
    }
}