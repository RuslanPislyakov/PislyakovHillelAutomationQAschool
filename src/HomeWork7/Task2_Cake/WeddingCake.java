package HomeWork7.Task2_Cake;

public class WeddingCake extends Cake {

    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void printWeddingCake(){
        System.out.println("Wedding cake");
        print();
        System.out.println("Floors: " + floors);
        System.out.println("");
    }

}
