import java.util.Scanner;

public class Lev2Problem3 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int number;

        // Taking user input
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        // Using for loop from 6 to 9
        for (int i = 6; i <= 9; i++) {

            int result = number * i;   // Store result in variable

            // Print in required format
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close scanner
        scanner.close();
    }
}