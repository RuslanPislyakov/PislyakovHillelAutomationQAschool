package HomeWork4;

import java.util.Random;
import java.util.Scanner;

//        1. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
//        продвиньте пользователя на это количество делений на игровом поле.
//        код который возвращает рандомное число от 1 до 6
//        Random random = new Random();
//        int die = random.nextInt(6) + 1;
//        2. После каждого броска вывести инфо в консоль пользователю, на каком игровом
//        поле он находится и сколько еще мест ему нужно пройти, чтобы выиграть.
//        3. Всего 5 бросков
//        4. Если пользователь набирает 20 до 5 бросков, завершите игру - он выиграл.
//        5. Если пользователь набирает больше или меньше 20 точно, то он проигрывает.
//        6. Помните, что на доске всего 20 делений, поэтому сообщение типа «Вы
//        продвинулись на позицию 22» - это баг)
public class BonesGame {
    public static void main(String[] args) {
        int currentPosition = 0;
        int fieldLength = 20;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Press enter to roll the dice");
            String toContinue = scanner.nextLine(); //Вколхозил выбрасывание кубика по нажатию энтера, чтоб добавить игре реалистичности
            int die = random.nextInt(6) + 1;
            currentPosition = currentPosition + die;
            if (currentPosition == fieldLength) {
                System.out.println("Congratulations! You win!!!");
                break;
            }
            if (currentPosition > fieldLength) {
                System.out.println("You lost! You roll " + die + " It's more than necessary");
                break;
            }
            if (i == 5) {
                System.out.println("You lost! You did not overcome required number of fields in 5 rolls");
                break;
            }
            System.out.println("Roll " + i + ". Your rolled " + die + " on the die. Your current position is " + currentPosition +
                    " You must overcome " + (fieldLength - currentPosition) + " fields to win");
        }
    }
}
