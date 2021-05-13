package HomeWork3;

import java.util.Scanner;

// Задача 2
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Odd Number / Нечетное число");
        } else {
            System.out.println("Even Number / Четное число");
        }
        System.out.println("BYE");
    }
}
