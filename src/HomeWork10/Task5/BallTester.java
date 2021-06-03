package HomeWork10.Task5;

/*
Написать Enum “Ball” у него будут поля
- размер (double)
- вид спорты (String)
- цена (double)
- материал (String)
 добавить гетеры и конструктор
добавить 5 видов мячей
переопределить toString
 в классе BallTester c помощью toString вывести в консоль инфу о мячах
 */
public class BallTester {

    public static void main(String[] args) {
        System.out.println(Ball.BASEBALL);
        System.out.println(Ball.BASKETBALL);
        System.out.println(Ball.HOCKEY);
        System.out.println(Ball.SOCCER);
        System.out.println(Ball.TENNIS);
    }
}
