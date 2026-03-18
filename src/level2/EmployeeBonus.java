import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Number of employees
        int size = 10;

        // Arrays
        double[] salary = new double[size];
        double[] years = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // Totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input data
        System.out.println("Enter details for 10 employees:");

        for (int i = 0; i < size; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = input.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.err.println("Invalid input. Please enter again.");
                i--; // retry same index
                continue;
            }
        }

        // Calculate bonus
        for (int i = 0; i < size; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");

        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        // Display totals
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close scanner
        input.close();
    }
}