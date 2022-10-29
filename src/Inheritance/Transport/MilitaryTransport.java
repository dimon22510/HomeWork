package Transport;

public class MilitaryTransport extends AirTransport {
    private int numOfMissilesOnBoard;   //number of missiles on board
    private boolean presenceOfAnEjectionSystem; //the presence of an ejection system (true/false);
    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int numOfMissilesOnBoard, boolean presenceOfAnEjectionSystem) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numOfMissilesOnBoard = numOfMissilesOnBoard;
        this.presenceOfAnEjectionSystem = presenceOfAnEjectionSystem;
    }

    @Override
    public void printInfo() {
        super.printInfo();

    }

    public void shot() {
        rocketLaunch();
    }

    public void ejection() {
        catapult();
    }

    private void rocketLaunch() {
        if (this.numOfMissilesOnBoard > 0) {
            this.numOfMissilesOnBoard--;
            System.out.println("The rocket went");
        } else {
            System.out.println("No ammo");
        }


    }

    private void catapult() {
        if (presenceOfAnEjectionSystem) {
            System.out.println("The ejection was successful");
        } else {
            System.out.println("You don't have such a system");
        }
    }


    public int getNumOfMissilesOnBoard() {
        return numOfMissilesOnBoard;
    }

    public void setNumOfMissilesOnBoard(int numOfMissilesOnBoard) {
        this.numOfMissilesOnBoard = numOfMissilesOnBoard;
    }

    public boolean isPresenceOfAnEjectionSystem() {
        return presenceOfAnEjectionSystem;
    }

    public void setPresenceOfAnEjectionSystem(boolean presenceOfAnEjectionSystem) {
        this.presenceOfAnEjectionSystem = presenceOfAnEjectionSystem;
    }
}
