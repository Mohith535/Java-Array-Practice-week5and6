import java.util.Scanner;

public class FriendsAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays for age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input values
        for (int i = 0; i < names.length; i++) {

            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Age: ");
            ages[i] = input.nextInt();

            System.out.print("Height: ");
            heights[i] = input.nextDouble();

            // Validation
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.err.println("Invalid input. Try again.");
                i--; // retry
                continue;
            }
        }

        // Find youngest
        int minAgeIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find tallest
        int maxHeightIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Output results
        System.out.println("\nYoungest: " + names[minAgeIndex]);
        System.out.println("Tallest: " + names[maxHeightIndex]);

        input.close();
    }
}