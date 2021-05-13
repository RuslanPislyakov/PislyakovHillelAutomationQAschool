package HomeWork3;

import java.util.Scanner;

// Задача 1
public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int mark = scanner.nextInt();
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
