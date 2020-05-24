package by.gsu.pms;

public class bus extends passengerCar {
    private int numSeats;

    public bus(int fuelConsumption, String timeRacing, int numSeats) {
        super(fuelConsumption, timeRacing);
        this.numSeats = numSeats;
    }

    public bus(String engineType, int power, int weight, int mileage, int fuelConsumption, String timeRacing, int numSeats) {
        super(engineType, power, weight, mileage, fuelConsumption, timeRacing);
        this.numSeats = numSeats;
    }

    public bus(int numSeats) {
        this.numSeats = numSeats;
    }
}
