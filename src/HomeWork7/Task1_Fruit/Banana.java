package HomeWork7.Task1_Fruit;

public class Banana extends Fruit {

    public Banana(int calories) {
        setCalories(calories);
    }

    public void peelBanana() {
        System.out.println("Сейчас происходит очистка банана");
    }

    @Override
    public void makeJuice() {
        System.out.println("Делаем банановый сок");
    }
}
