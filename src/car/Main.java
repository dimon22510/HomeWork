package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 220, 4500);
        car.printInfo();
        try {
            car.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        try {
            car.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        try {
            car.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        System.out.println("==========================================================");
        Car bibi = new Car("Skoda", 200, 3500);
        bibi.printInfo();
        try {
            bibi.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        try {
            bibi.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        try {
            bibi.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        System.out.println("==========================================================");
        Car vrum = new Car("Volvo", 230, 4500);
        vrum.printInfo();
        try {
            vrum.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        try {
            vrum.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
        try {
            vrum.start();
        } catch (MyException e) {
            System.out.println("Something happened. The car didn't start");
        }
    }
}
