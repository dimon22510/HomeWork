package Transport;

public class Main {
    public static void main(String[] args) {
        PassengerTransport skoda = new PassengerTransport(300, 240, 3, "Skoda", 4, 15, "Sedan", 5);
        skoda.printInfo();
        System.out.println("==================================");
        skoda.printInfo2();
        System.out.println("==================================");
        FreightTransport truck = new FreightTransport(350, 150, 7, "MAN", 10, 20, 5);
        truck.printInfo();
        System.out.println("======================================");
        CivilTransport samolet = new CivilTransport(45000, 943, 28, "Boeing", 29, 3050, 130, false);
        samolet.printInfo();
        System.out.println("================================");
        MilitaryTransport fighter = new MilitaryTransport(30000, 2600, 30, "Sy 57", 14, 200, 5, false);
        fighter.printInfo();
        fighter.shot();
        fighter.ejection();

    }
}
