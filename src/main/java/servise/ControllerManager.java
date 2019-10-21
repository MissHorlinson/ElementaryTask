package servise;

import controller.*;
import util.*;

public class ControllerManager {
    private Input input = new Input();
    private Output output = new Output();
    private Helper helper = new Helper();
    private Validator validator = new Validator();
    private Parser parser = new Parser();

    public ControllerManager() { }

    public void runChosenTask() {
        while (true) {
            helper.startInstruction();
            switch (parser.toInt(input.getString())) {
                case 1:
                    chessRun();
                    break;
                case 2:
                    envelopeRun();
                    break;
            }
            output.continueRequest("program");
            if(!validator.userAnswer(input.getString()))
                break;
        }
    }


    public void chessRun() {
        helper.chessBoardDescription();
        PrintChessBoard chessBoard = new PrintChessBoard();
        chessBoard.boardToScreen();
    }

    public void envelopeRun() {
        helper.envelopesCompareDescription();
        while (true) {
            CompareEnvelopes compareEnvelopes = new CompareEnvelopes();
            compareEnvelopes.envelopesCompare();
            output.continueRequest("Task 2");
            if(!validator.userAnswer(input.getString()))
                break;
        }
    }
}

