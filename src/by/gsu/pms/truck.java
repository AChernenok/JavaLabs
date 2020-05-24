package by.gsu.pms;

public class truck extends Car {
    private int carrying;
    private String carBody;

    public truck(int carrying, String carBody) {
        this.carrying = carrying;
        this.carBody = carBody;
    }

    public truck(String engineType, int power, int weight, int mileage, int carrying, String carBody) {
        super(engineType, power, weight, mileage);
        this.carrying = carrying;
        this.carBody = carBody;
    }
}
