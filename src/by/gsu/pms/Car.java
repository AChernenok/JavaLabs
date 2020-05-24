package by.gsu.pms;

public class Car {
    private String engineType;
    private int power;
    private int weight;
    private int mileage;

    public Car() {
    }

    public Car(String engineType, int power, int weight, int mileage) {
        this.engineType = engineType;
        this.power = power;
        this.weight = weight;
        this.mileage = mileage;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
