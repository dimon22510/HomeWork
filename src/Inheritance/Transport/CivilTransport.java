package Transport;

import java.util.Scanner;

public class CivilTransport extends AirTransport {
    private int numOfPassengers;  //number of passengers
    private boolean availabilityOfBusinessClass;  //existence of business class(true/false)

    public CivilTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int numOfPassengers, boolean availabilityOfBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numOfPassengers = numOfPassengers;
        this.availabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        check();
        passengerCapacity();
    }

    private void passengerCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of passengers - ");
        int passenger = scanner.nextInt();
        if (passenger <= this.numOfPassengers) {
            System.out.println("Plane is loaded");
        } else {
            System.out.println("You need a bigger plane");
        }
    }

    private void check() {
        if (availabilityOfBusinessClass) {
            System.out.println("You're lucky. This aircraft has a business class");
        } else {
            System.out.println("Sorry, there is no business class on the plane");
        }
    }


    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public boolean isAvailabilityOfBusinessClass() {
        return availabilityOfBusinessClass;
    }

    public void setAvailabilityOfBusinessClass(boolean availabilityOfBusinessClass) {
        this.availabilityOfBusinessClass = availabilityOfBusinessClass;
    }
}
