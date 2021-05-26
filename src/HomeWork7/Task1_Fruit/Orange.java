package HomeWork7.Task1_Fruit;

import HomeWork7.Task1_Fruit.Fruit;

public class Orange extends Fruit {

    public Orange(int calories) {
        setCalories(calories);
    }

    public void peelOrange() {
        System.out.println("Сейчас происходить очистка апельсина");
    }

    @Override
    public void makeJuice() {
        System.out.println("Делаем апельсиновый сок");
    }
}
