import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }

    /**
     * Checks if a given number is prime.
     * A prime number is a natural number greater than 1 that has no positive divisors
     * other than 1 and itself.
     *
     * @param num The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1.
        if (num <= 1) {
            return false;
        }

        // We only need to check for divisors up to the square root of the number.
        // If a number has a divisor larger than its square root, it must also have
        // a corresponding divisor that is smaller than its square root.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // If the number is divisible by any 'i', it's not prime.
                return false;
            }
        }

        // If no divisors were found, the number is prime.
        return true;
    }
}
