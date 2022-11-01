package Transport;

public class GroundTransport extends Transport {
    private int numOfWheels;     // wheel count
    private int fuelConsumption;   // fuel consumption(l/100km)
    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numOfWheels = numOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("The number of wheels in our car - " + this.numOfWheels);
        System.out.println("Fuel consumption of our car - " + this.fuelConsumption + " l/100km");
    }

    @Override
    public void printInfo2() {
        super.printInfo2();
        double result = (x * this.fuelConsumption) / 100;
        System.out.println("and spend - " + result + " liters of fuel");
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
