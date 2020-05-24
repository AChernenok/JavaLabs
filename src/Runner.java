import by.gsu.pms.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        carMark[] carMarks = new carMark[3];

        carMarks[0] = new carMark();
        carMarks[1]= new carMark("Volkwagen", new passengerCar[]{
                new passengerCar("Diesel", 120, 2500, 173000, 5, "5.5"),
                new passengerCar("Fuel", 22, 1500, 150000, 7, "12.5")
        });
        carMarks[2]=new carMark("Tesla", new truck[]{
                new truck("Diesel", 220, 4500, 850000, 250, "closed"),
                new truck("Fuel", 340, 4700, 120000, 450, "open")
        });
        carMarks[3]=new carMark("Opel", new bus[]{
                new bus(22, "13",8)
        });
    }
}
