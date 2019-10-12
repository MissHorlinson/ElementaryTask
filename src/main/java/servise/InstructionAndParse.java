package servise;

import util.Helper;
import util.Input;
import util.Output;

public class InstructionAndParse {
    private static Input input = new Input();
    private static Helper helper = new Helper();

    public static int chessBoard(String side){
        int sideValue = 0;
        helper.chessBoardInstruction(side);
        while(sideValue <= 0) {
            Output.negativeNumber();
            sideValue = input.getInt();
        }
        return sideValue;
    }

    public static float envelope(String number){
        float sideValue = 0;
        helper.envelopeInstruction(number);
        while (sideValue <= 0) {
            Output.negativeNumber();
            sideValue = input.getFloat();
        }
        return sideValue;
    }


}
