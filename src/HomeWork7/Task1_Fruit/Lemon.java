package HomeWork7.Task1_Fruit;

import HomeWork7.Task1_Fruit.Fruit;

public class Lemon extends Fruit {

    public Lemon(int calories) {
        setCalories(calories);
    }

    public void peelLemon() {
        System.out.println("Сейчас происходить очистка лимона");
    }

    @Override
    public void makeJuice() {
        System.out.println("Делаем лимонный сок");
    }
}
