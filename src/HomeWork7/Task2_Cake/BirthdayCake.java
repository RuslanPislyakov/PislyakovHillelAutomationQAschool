package HomeWork7.Task2_Cake;

public class BirthdayCake extends Cake {

    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public void printBirthdayCake(){
        System.out.println("Birthday cake");
        print();
        System.out.println("Candles: " + candles);
        System.out.println("");
    }
}
