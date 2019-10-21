package util;

public class Output {

    public void chessBoardInstruction(String side) {
        System.out.println("Enter " + side + " of a board");
    }

    public void printStar() {
        System.out.print("*");
    }

    public void printSpace() {
        System.out.print(" ");
    }

    public void negativeNumber() {
        System.out.println("It should be positive number > 0");
    }

    public void newLine() {
        System.out.println();
    }

    public void notNumber() {
        System.out.println("That not a number: ");
    }

    public void envelopeInstruction(String number) {
        System.out.println("Enter " + number + " envelope parameters");
    }

    public void envelopeInput() {
        System.out.println("Yes you can input one envelope in the other");
    }

    public void envelopeNotInput() {
        System.out.println("No you can`t input one envelope in the other");
    }

    public void continueRequest(String action) {
        System.out.println("Enter y - Yes, if you want to continue " + action + "?");
    }
}
