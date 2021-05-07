package HomeWork4;

import java.util.Scanner;

// 5. Написать программу, которая выводит реверсивную строку
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type word or phrase");
        String source = scanner.nextLine();

        String[] sourceArray = source.split("");

        System.out.println("Reverse word or phrase:");
        for (int i = source.length()-1; i >= 0; i--) {
            System.out.print(sourceArray[i]);
        }
    }
}
