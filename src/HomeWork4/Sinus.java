package HomeWork4;

// 2. Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов от 0 до 360.
public class Sinus {
    public static void main(String[] args) {

        double sin;
        for (int i = 0; i <= 360; i = i + 10) {
            sin = Math.sin(i);
            System.out.println("Sinus for " + i + " degrees is " + sin);
        }
    }
}
