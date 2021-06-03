package HomeWork10.Task5;

public enum Ball {

    SOCCER(50.0, "soccer", 100, "leather"), BASKETBALL(55, "basketball", 105, "vinyl"),
    BASEBALL(20, "baseball", 99, "leatherette"), TENNIS(50, "tennis", 40, "rubber"),
    HOCKEY(30, "hockey", 20, "plastic");

    private double size;
    private String kindOfSport;
    private double price;
    private String material;

    Ball(double size, String kindOfSport, double price, String material) {
        this.size = size;
        this.kindOfSport = kindOfSport;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", kindOfSport='" + kindOfSport + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
