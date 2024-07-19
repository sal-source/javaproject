package garbagepackage;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + "is prime number");
        } else {
            System.out.println(num + " is not prime");
        }

    }

    // the number is prime only can be divided by 1 or itself

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}