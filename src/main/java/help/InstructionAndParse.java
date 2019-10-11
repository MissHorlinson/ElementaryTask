package help;

import java.util.Scanner;

public class InstructionAndParse {

    static Scanner in = new Scanner(System.in);



    public static int chessBoardInstructionAndParse(String side){
        int sideValue = 0;

        System.out.println("Enter " + side + " of a board");
        while(sideValue <= 0) {
            System.out.println("It should be positive integer number > 0");
            isNumber();
            sideValue = in.nextInt();
        }
        return sideValue;
    }

    public static void envelopesCompareDescription(){
        System.out.println("Task 2: compare two envelopes and say can we put one into the other\n-------------------------------------------------------------------");
    }

    public static float envelopeInstructionAndParse(String number){
        float sideValue = 0;

        System.out.println("Enter " + number + " envelope parameters");
        while (sideValue <= 0) {
            System.out.println("Input positive number > 0 ");
            isNumber();
            sideValue = in.nextFloat();
        }
        return sideValue;
    }

    public static void isNumber(){
        while (!in.hasNext("[-+]?\\d+")) {
            System.out.println("That not a number: ");
            in.next();
        }
    }
}
