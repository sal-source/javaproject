package thirdpackage;

import java.util.Scanner;

// in scanner :
public class ScannerPractice2 {  // if you to use string we use scanner.next();
    // if i want to use integer we use scanner.nextInt();

    public static void main(String[] args) {
        //math();
        ageCalculator();
    }

    public static void ageCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert your name:");
        String name = scanner.next();

        System.out.println("enter your age :");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println(" your are welcome ");
        } else if (age < 18) {
            System.out.println(" I need to see your ID");
        }
    }

    public static void math() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please insert your name");
        String name = scanner.next();

        System.out.println("please insert number1 :");
        int number1 = scanner.nextInt();

        System.out.println("please insert number2 :");
        int number2 = scanner.nextInt();

        System.out.println("if you want to + insert 1");
        System.out.println("if you want to - insert 2");

        int condition = scanner.nextInt();
        int total = 0;

        if (condition == 1) {
            total = number1 + number2;
        } else if (condition == 2) {
            total = number1 - number2;

        }

        System.out.println(name + "'s result  is " + total);

    }
}

