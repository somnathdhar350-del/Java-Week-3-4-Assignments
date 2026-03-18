import java.util.Scanner;

public class Lev2Problem2 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int number;

        // Taking user input
        System.out.print("Enter a natural number: ");
        number = scanner.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Check whether the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }

        // Close scanner
        scanner.close();
    }
}