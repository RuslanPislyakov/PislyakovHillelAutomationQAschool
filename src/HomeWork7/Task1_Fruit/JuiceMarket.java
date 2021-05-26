package HomeWork7.Task1_Fruit;

import HomeWork7.Task1_Fruit.Apple;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple apple = new Apple(100);
        Banana banana = new Banana(200);
        Orange orange = new Orange(300);
        Lemon lemon = new Lemon(400);

        apple.removeSeeds();
        apple.makeJuice();

        banana.peelBanana();
        banana.makeJuice();

        orange.peelOrange();
        orange.makeJuice();

        lemon.peelLemon();
        lemon.makeJuice();
    }
}
