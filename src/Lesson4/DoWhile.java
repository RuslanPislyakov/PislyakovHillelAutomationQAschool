package Lesson4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter first number");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter second number");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("The sum is " + sum);
            System.out.println("Would you to continue? true/false");
            again = scanner.nextBoolean();

        }
        while (again);
    }
}

