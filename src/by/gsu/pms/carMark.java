package by.gsu.pms;

public class carMark {
    String markName;
    Car[] carName;

    public carMark() {
        this.carName = new Car[0];
    }

    public carMark(Car[] carName) {
        this.carName = carName;
    }

    public carMark(String markName, Car[] carName) {
        this.markName = markName;
        this.carName = carName;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public Car[] getCarName() {
        return carName;
    }

    public void setCarName(Car[] carName) {
        this.carName = carName;
    }


}
