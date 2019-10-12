package servise;

import controller.PrintChessBoard;
import controller.CompareEnvelopes;

public class Run {

    public void chessRun() {
            PrintChessBoard chessBoard = new PrintChessBoard();
            chessBoard.boardToScreen();
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
