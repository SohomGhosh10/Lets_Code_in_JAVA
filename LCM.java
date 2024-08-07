import java.util.Scanner;

public class LCMCalculator {

    // Function to calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the Least Common Multiple (LCM)
    public static int lcm(int num1, int num2) {
        return Math.abs(num1 * num2) / gcd(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Check for non-positive numbers
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Both numbers must be positive whole numbers.");
        } else {
            int lcmValue = lcm(num1, num2);
            System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is " + lcmValue + ".");
        }

        scanner.close();
    }
}
