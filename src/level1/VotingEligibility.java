import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare array to store ages of 10 students
        int[] ages = new int[10];

        // Input ages
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Validate input
            if (ages[i] < 0) {
                System.err.println("Invalid age entered. Program exiting.");
                System.exit(0);
            }
        }

        // Check voting eligibility
        System.out.println("\nVoting Eligibility:");

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        // Close scanner
        input.close();
    }
}