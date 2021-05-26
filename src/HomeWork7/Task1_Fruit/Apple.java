package HomeWork7.Task1_Fruit;

public class Apple extends Fruit {

    public Apple(int calories) {
        setCalories(calories);
    }

    public void removeSeeds() {
        System.out.println("Сейчас происходит удаление косточек из яблока");
    }

    @Override
    public void makeJuice() {
        System.out.println("Делаем яблочный сок");
    }
}
