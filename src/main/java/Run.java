import Chess.ChessBoard;
import Envelope.Envelope;

public class Run {

    public void chessRun() {
        boolean shouldContinue = true;

        while (shouldContinue) {
            //int height = Instruction.chessBoardInstructionAndParse("height");
            //int width = Instruction.chessBoardInstructionAndParse("width");
            ChessBoard board = new ChessBoard(InstructionAndParse.chessBoardInstructionAndParse("height"),
                    InstructionAndParse.chessBoardInstructionAndParse("width")); //height, width);
            board.boardToScreen();

            shouldContinue = ContinueRequest.userAnswer("Task 1");
        }
    }


    public void envelopeRun() {
        boolean shouldContinue = true;

        while (shouldContinue) {
        float sides[] = new  float[4];

        System.out.println("Enter sides of envelope");
        for (int i = 0; i < sides.length; i++) {
            sides[i] = InstructionAndParse.envelopeInstructionAndParse();
        }
        Envelope envelope = new Envelope(sides);
        envelope.compareMethod();

        shouldContinue = ContinueRequest.userAnswer("Task 2");
        }
    }
}
