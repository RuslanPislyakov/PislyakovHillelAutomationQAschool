import java.util.Scanner;

// Задача 8
public class ManagerSalarySecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество продаж");
        double dealAmount = scanner.nextDouble();
        int baseSalary = 1000;
        int bonusSalary = 250;
        int salary;
        if (dealAmount > 10) {
            System.out.println("Well done! You've got a bonus!");
            salary = baseSalary + bonusSalary;
        }
        else {
            salary = baseSalary;
            System.out.println("You should make " + (10 - dealAmount) + " deals to get bonus");
        }
        System.out.println("Your salary is " + salary + "$");
    }
}
