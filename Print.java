import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");

        // Read the string input from the user
        String userInput = scanner.nextLine();

        // Display the input
        System.out.println("You entered: " + userInput);

    }
}
