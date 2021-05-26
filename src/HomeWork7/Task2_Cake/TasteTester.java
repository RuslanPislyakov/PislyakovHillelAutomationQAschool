package HomeWork7.Task2_Cake;

public class TasteTester {

    public static void main(String[] args) {

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(1000);
        weddingCake.setTaste("Disgusting");
        weddingCake.setFloors(5);

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(800);
        birthdayCake.setTaste("Delicious");
        birthdayCake.setCandles(6);

        weddingCake.printWeddingCake();
        birthdayCake.printBirthdayCake();
    }
}
