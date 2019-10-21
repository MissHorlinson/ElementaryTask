package controller;

import model.ChessBoard;
import util.*;

public class PrintChessBoard {
    private Input  input = new Input();
    private Output output = new Output();
    private Parser parser = new Parser();

    public PrintChessBoard() { }

    ChessBoard board = new ChessBoard(chessBoard("height"), chessBoard("width"));

    public void boardToScreen() {
        for(int i = 0; i < board.getHeight(); i++) {
            for(int j = 0; j < board.getWidth(); j++) {
                symbolPrint(i, j);
            }
            output.newLine();
        }
    }

    public void symbolPrint(int row, int cell) {
        if(((cell + row) % 2 ) == 0) {
            output.printStar();
        } else {
            output.printSpace();
        }
    }

    public int chessBoard(String side) {
        int sideValue = 0;
        output.chessBoardInstruction(side);
        while(sideValue <= 0) {
            output.negativeNumber();
            sideValue = parser.toInt(input.getString());
        }
        return sideValue;
    }
}
