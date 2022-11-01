package Transport;

import java.util.Scanner;

public class Transport {
    private int power;                   // Power (in horsepower)
    private int maxSpeed;               // maximum speed (km/h)
    private int weight;                  // mass (kg)
    private String brand;                 // brand
    protected int x;                     // how far did the car travel in a certain time

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Brand of our transport - " + this.brand);
        System.out.println("The capacity of our transport is - " + this.power + " Horse power");
        powerInKiloWatts();
        System.out.println("The maximum transport speed is - " + this.maxSpeed + " kilometers per hour");
        System.out.println("And its mass is - " + this.weight + " tons");
    }

    private void powerInKiloWatts() {
        this.power /= 1.36;
        System.out.println("The capacity of our transport in kilowatts is - " + this.power + " kW");
    }

    public void printInfo2() {
        calculationKm();
    }


    private void calculationKm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time - ");
        int time = scanner.nextInt();
        this.x = time * this.maxSpeed;
        System.out.println("During - " + time + " hour, automobile " + this.brand + " moving at maximum speed - " + this.maxSpeed + "km/h will pass - " + x + " km");
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
