package HomeWork3;

import java.util.Scanner;

// Задача 7
public class ManagerSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество продаж");
        double dealAmount = scanner.nextDouble();
        int baseSalary = 1000;
        int bonusSalary = 250;
        int salary;
        if (dealAmount > 10) {
            salary = baseSalary + bonusSalary;
        }
        else salary = baseSalary;
        System.out.println("Manager salary is " + salary + "$");
    }
}