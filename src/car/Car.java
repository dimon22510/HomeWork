package car;

import java.util.Random;

public class Car {

    private String brand;
    private double maxSpeed;
    private int price;

    public Car(String brand, double maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Car brand - " + this.brand + ", has top speed - " + this.maxSpeed +
                "km/h, and is sold for - " + this.price + "$");
    }

    protected void start() throws MyException {
        Random random = new Random();
        int r = random.nextInt(20);
        if (r % 2 == 0) {
            throw new MyException();
        } else if (r % 2 == 1) {
            System.out.println("The car started");
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return maxSpeed;
    }

    public void setSpeed(double speed) {
        this.maxSpeed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
