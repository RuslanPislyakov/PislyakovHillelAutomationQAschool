package HomeWork4;

import java.util.Scanner;

// 4. Написать программу, которая проверяет является ли строка палиндромом (используя массив char)
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type word or phrase");
        String source = scanner.nextLine();

        char[] arrayOfChars = source.toCharArray();

        boolean isPalindrome = true;
        for (int i = 0; i <= arrayOfChars.length - 1; i++) {
            if (arrayOfChars[i] != arrayOfChars[arrayOfChars.length - 1 - i]) isPalindrome = false;
        }
        System.out.println("Word or phrase is palindrome: " + isPalindrome);
    }
}

