package by.gsu.pms;

public class passengerCar extends Car {
    private int fuelConsumption;
    private String timeRacing;

    public passengerCar(int fuelConsumption, String timeRacing) {
        this.fuelConsumption = fuelConsumption;
        this.timeRacing = timeRacing;
    }

    public passengerCar(String engineType, int power, int weight, int mileage, int fuelConsumption, String timeRacing) {
        super(engineType, power, weight, mileage);
        this.fuelConsumption = fuelConsumption;
        this.timeRacing = timeRacing;
    }

    public passengerCar() {
    }

}
