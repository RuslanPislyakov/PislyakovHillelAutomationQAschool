import java.util.Scanner;

public class FingersName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер пальца");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Большой");
                break;
            case 2:
                System.out.println("Указательный");
                break;
            case 3:
                System.out.println("Средний");
                break;
            case 4:
                System.out.println("Безымянный");
                break;
            case 5:
                System.out.println("Мизинец");
                break;
            default:
                System.out.println("Не верный ввод. Введите цифру от 1 до 5");
        }
    }
}
