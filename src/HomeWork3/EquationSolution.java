package HomeWork3;

import java.util.Scanner;

// Задача 6
public class EquationSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        double a = scanner.nextDouble();
        System.out.println("Введите b");
        double b = scanner.nextDouble();
        double x;

        if (a != 0) {
            x = -b / a;
            System.out.println("x= " + x + " в уравнении " + a + "*x + " + b + " = 0");
        } else System.out.println("а не может равняться 0. Попробуйте еще раз");
    }
}
