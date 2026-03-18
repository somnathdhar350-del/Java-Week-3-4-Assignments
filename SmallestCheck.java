import java.util.Scanner;

public class SmallestCheck {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare variables
        int number1, number2, number3;

        // Take user input
        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        number3 = sc.nextInt();

        // Check if first number is smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print result
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}