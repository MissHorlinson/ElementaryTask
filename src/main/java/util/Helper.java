package util;

public class Helper {
    public static void startInstruction(){
        System.out.println("util.Input:\n   1 for ChessBoard task\n   2 for Envelope compare task\n____________________________________");
    }

    public static void chessBoardDescription() {
        System.out.println("Task 1: print the chess board to screen\n---------------------------------------");
    }

    public static void chessBoardInstruction(String side) {
        System.out.println("Enter " + side + " of a board");
    }

    public static void envelopesCompareDescription(){
        System.out.println("Task 2: compare two envelopes and say can we put one into the other\n-------------------------------------------------------------------");
    }

    public static void envelopeInstruction(String number){
        System.out.println("Enter " + number + " envelope parameters");
    }
    public static void continueRequest(String action){
        System.out.println("Enter y - Yes, if you want to continue " + action + "?");
    }


}
