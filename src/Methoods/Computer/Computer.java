package Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private int turnOnOff;
    private boolean isBroken;
    private boolean isTurnedOn;


    public Computer(String cpu, int ram, int ssd, int turnOnOff) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.turnOnOff = turnOnOff;
    }

    public void printInfoComputer() {     // метод
        System.out.println("Our pc has a processor - " + this.cpu);
        System.out.println("Also in it - " + this.ram + " GB RAM");
        System.out.println("The hard drive has a capacity - " + this.ssd + " GB");
        System.out.println("The number of on / off of our PC - " + this.turnOnOff + " once");

    }

    public void turnOn() {
        System.out.println("===========================");
        System.out.println("We start the computer");
        if (this.isTurnedOn) {
            System.out.println("Computer already on");
            return;
        }
        if (this.isBroken) {
            System.out.println("The computer is broken. Can't enable.");
            return;
        }
        if (this.turnOnOff == 0) {
            this.isBroken = true;
            System.out.println("The resource has run out. Computer broken");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n = scanner.nextInt();
        Random random = new Random();
        int r;
        r = random.nextInt(2);
        if (n == r) {
            this.isTurnedOn = true;
            System.out.println("Computer running.");
        } else {
            this.isBroken = true;
            System.out.println("Computer burned out.");
        }

    }

    public void turnOff() {
        if (this.isBroken) {
            System.out.println("The computer is broken. Nothing to turn off");
            return;
        }
        if (this.isTurnedOn) {
            this.isTurnedOn = false;
            this.turnOnOff--;
            System.out.println("Computer turned off");
        } else {
            System.out.println("Computer is already off");
        }

    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getTurnOnOff() {
        return turnOnOff;
    }

    public void setTurnOnOff(int turnOnOff) {
        this.turnOnOff = turnOnOff;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

}

