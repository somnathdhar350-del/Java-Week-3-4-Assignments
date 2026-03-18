import java.util.Scanner;

public class Lev2Problem1 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable declarations
        double salary;
        int yearsOfService;
        double bonus = 0;
        double bonusPercentage = 0.05;   // 5% bonus

        // Taking user input
        System.out.print("Enter employee salary: ");
        salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        yearsOfService = scanner.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            bonus = salary * bonusPercentage;
        } else {
            bonus = 0;
        }

        // Print bonus amount
        System.out.println("Bonus Amount: " + bonus);

        // Close scanner
        scanner.close();
    }
}