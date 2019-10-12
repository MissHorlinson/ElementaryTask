package servise;

import controller.PrintChessBoard;
import controller.CompareEnvelopes;
import util.Validator;

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
            shouldContinue = Validator.userAnswer("Task 2");
        }
    }
}
