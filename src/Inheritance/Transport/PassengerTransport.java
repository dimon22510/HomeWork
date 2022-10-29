package Transport;

public class PassengerTransport extends GroundTransport {
    private String bodyType;    //body type
    private int numOfPassengers; // number of passengers


    public PassengerTransport(int power, int maxSpeed, int weight, String brand, int numOfWheels, int fuelConsumption, String bodyType, int numOfPassengers) {
        super(power, maxSpeed, weight, brand, numOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numOfPassengers = numOfPassengers;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Body type of our car - " + bodyType);
        System.out.println("In the car is - " + numOfPassengers + " passengers");
    }


    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}
