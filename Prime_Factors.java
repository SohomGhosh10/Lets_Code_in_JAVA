import java.util.Scanner;

class Prime_Factors {

    // Method to check if a number is prime
    int isPrime(int num) {
        if (num <= 1) return 0; // 1 and below are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0; // Not prime
            }
        }
        return 1; // Prime
    }

    // Method to print prime factors
    void primefact(int num) {
        for (int i = 2; i <= num; i++) { // Start from 2 (smallest prime)
            if (num % i == 0 && isPrime(i) == 1) {
                System.out.println(i); // Print prime factor
            }
        }
    }

    public static void main(String[] args) {
        Prime_Factors pf = new Prime_Factors();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime factors of " + num + ":");
        pf.primefact(num); // Find and print prime factors
    }
}

