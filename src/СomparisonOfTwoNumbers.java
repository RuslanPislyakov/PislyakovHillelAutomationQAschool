import java.util.Scanner;

// Задача 5
public class СomparisonOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number_1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number_2 = scanner.nextInt();
        if (number_1 > number_2) System.out.println("The number " + number_1 + " has the greatest value");
        if (number_2 > number_1) System.out.println("The number " + number_2 + " has the greatest value");
    }
}