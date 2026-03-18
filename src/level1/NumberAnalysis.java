import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Declare array of size 5
        int[] numbers = new int[5];

        // Input values
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        System.out.println("\nNumber Analysis:");

        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            if (num > 0) {
                System.out.print(num + " is Positive and ");

                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else if (num < 0) {
                System.out.println(num + " is Negative");

            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison between first and last element:");

        if (first == last) {
            System.out.println("Both are equal");
        } else if (first > last) {
            System.out.println("First element is greater");
        } else {
            System.out.println("Last element is greater");
        }

        // Close scanner
        input.close();
    }
}