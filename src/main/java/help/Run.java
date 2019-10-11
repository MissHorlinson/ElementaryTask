package help;

import chess.PrintChessBoard;
import envelope.CompareEnvelopes;

public class Run {

    public void chessRun() {
        boolean shouldContinue = true;

        while (shouldContinue) {
            PrintChessBoard chessBoard = new PrintChessBoard();
            chessBoard.boardToScreen();
            shouldContinue = ContinueRequest.userAnswer("Task 1");
        }
    }


    public void envelopeRun() {
        boolean shouldContinue = true;

        while (shouldContinue) {
            CompareEnvelopes compareEnvelopes = new CompareEnvelopes();
            compareEnvelopes.envelopesCompare();
            shouldContinue = ContinueRequest.userAnswer("Task 2");
        }
    }
}
