package Transport;

import java.util.Scanner;

public class FreightTransport extends GroundTransport {
    private int loadCapacity;  //грузоподъемность(т)

    public FreightTransport(int power, int maxSpeed, int weight, String brand, int numOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, numOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("The carrying capacity of our transport is - " + this.loadCapacity + " tons");
        System.out.println("===========================");
        carryingCapacity();
    }

    private void carryingCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much cargo you need to load  - ");
        int cargo = scanner.nextInt();
        if (cargo <= this.loadCapacity) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("Do you need a bigger truck");
        }
    }


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
