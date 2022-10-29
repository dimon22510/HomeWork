package Transport;

public class AirTransport extends Transport {
    private int wingspan;  //wingspan
    private int minRunwayLength;  // minimum runway length


    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("The wingspan of our aircraft is - " + this.wingspan + " meters ");
        System.out.println("And the minimum length of the runway should be - " + this.minRunwayLength + " meters");
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }
}
