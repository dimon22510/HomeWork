package Calculator;

public class Calculator {
    int theFirstNum;
    int theSecondNum;

    public Calculator(int theFirstNum, int theSecondNum) {
        this.theFirstNum = theFirstNum;
        this.theSecondNum = theSecondNum;
    }

    public void theFirstOperation() {
        System.out.print("Addition operation - ");
        System.out.println(theFirstNum + theSecondNum);
    }

    public void theSecondOperation() {
        System.out.print("Subtraction operation - ");
        System.out.println(theFirstNum - theSecondNum);
    }

    public void theThirdOperation() {
        System.out.print("Multiplication operation - ");
        System.out.println(theFirstNum * theSecondNum);
    }

    public void theFourthOperation() {
        System.out.print("Divide operation - ");
        System.out.println(theFirstNum / theSecondNum);
    }

}

