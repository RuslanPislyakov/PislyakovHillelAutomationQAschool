import java.util.Scanner;

// Задача 4
public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();

        // Первый способ
        System.out.println("Решение через if");
        if (number == 1) System.out.println("Monday");
        if (number == 2) System.out.println("Tuesday");
        if (number == 3) System.out.println("Wednesday");
        if (number == 4) System.out.println("Thursday");
        if (number == 5) System.out.println("Friday");
        if (number == 6) System.out.println("Saturday");
        if (number == 7) System.out.println("Sunday");
        if (number > 7 | number < 1) System.out.println("Not a valid day");

        // Второй способ
        System.out.println("Решение через switch");
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
