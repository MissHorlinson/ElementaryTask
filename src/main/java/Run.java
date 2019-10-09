import Chess.ChessBoard;
import Envelope.CompareEnvelopes;

public class Run {

    public void chessRun() {
        boolean shouldContinue = true;

        while (shouldContinue) {
            //int height = Instruction.chessBoardInstructionAndParse("height");
            //int width = Instruction.chessBoardInstructionAndParse("width");
            ChessBoard board = new ChessBoard(Instruction.chessBoardInstructionAndParse("height"),
                    Instruction.chessBoardInstructionAndParse("width")); //height, width);
            board.BoardToScreen();

            shouldContinue = ContinueRequest.userAnswer("Task 1");
        }
    }


    public void envelopeRun() {
        boolean shouldContinue = true;

        while (shouldContinue) {
        float sides[] = new  float[4];

        System.out.println("Enter sides of envelopes");
        for (int i = 0; i < sides.length; i++) {
            sides[i] = Instruction.envelopesCompareInstructionAndParse();
        }
        CompareEnvelopes envelopes = new CompareEnvelopes(sides);
        envelopes.compareMethod();

        shouldContinue = ContinueRequest.userAnswer("Task 2");
        }
    }
}
