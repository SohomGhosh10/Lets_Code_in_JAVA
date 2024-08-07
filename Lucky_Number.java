import java.util.Scanner;

public class LuckyNumberCheckAlternative {

    // Function to check if a number is a lucky number
    public static boolean isLuckyNumber(int number) {
        int sumOfSquares = 0;
        int position = 1; // Start from the first digit

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            number /= 10; // Remove the last digit

            // Check if the current position is even
            if (position % 2 == 0) {
                sumOfSquares += digit * digit; // Square the digit and add to sum
            }
            
            position++; // Move to the next position
        }

        // Check if the sum of squares is a multiple of 9
        return sumOfSquares % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isLuckyNumber(number)) {
            System.out.println(number + " is a lucky number.");
        } else {
            System.out.println(number + " is not a lucky number.");
        }

        scanner.close();
    }
}
