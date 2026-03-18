import java.util.Scanner;   
public class Lev1Problem1 {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Declare variable for user input
        int number;

        // Take input from user
        System.out.print("Enter a number: ");   // <-- fixed typo (removed s:)
        number = sc.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Print result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        sc.close();
    }
}