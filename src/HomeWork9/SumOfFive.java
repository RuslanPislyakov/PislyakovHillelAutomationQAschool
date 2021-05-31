package HomeWork9;

import java.util.Scanner;

/*
1. Написать в main метод который вычисляет сумму 5 double. Получает он их со
сканера. Сделать это в цикле for. Если пользователь вводит неверный тип
данных - эта ошибка обрабатывается - выводится в консоль инфо и программа
продолжает свое действие. Важно чтобы даже если число суммируемых чисел
было 5 (т е если пользователь ввел неверное знач, то счетчик не
увеличивается)
 */
public class SumOfFive {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 0; i <= 4; i++) {
            try {
                Scanner scanner = new Scanner(System.in);
                double number = scanner.nextDouble();

                sum = sum + number;
            } catch (Exception e) {
                System.out.println("Please use numbers only!");
                i--;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
