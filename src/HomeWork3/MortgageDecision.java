package HomeWork3;

import java.util.Scanner;

// Задача 9
public class MortgageDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст жены");
        int wifeAge = scanner.nextInt();
        System.out.println("Введите возраст мужа");
        int husbandAge = scanner.nextInt();

        if (wifeAge < 35) {
            if (husbandAge < 35) {
                System.out.println("Your mortgage is approved!");
            } else System.out.println("Sorry, you too old for slavery.");
        } else System.out.println("Sorry, you too old for slavery.");
    }
}
