package controller;

import model.ChessBoard;
import util.Helper;
import util.Input;
import util.Output;

public class PrintChessBoard {
    private static Input input = new Input();

    ChessBoard board = new ChessBoard(chessBoard("height"), chessBoard("width"));

    public void boardToScreen(){
        for(int i = 0; i < board.getHeight(); i++){
            for(int j = 0; j < board.getWidth(); j++){
                symbolPrint(i, j);
            }
            System.out.println();
        }
    }

    public void symbolPrint(int row, int cell){
        if(((cell + row) % 2 ) == 0){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
    }

    public int chessBoard(String side){
        int sideValue = 0;
        Helper.chessBoardInstruction(side);
        while(sideValue <= 0) {
            Output.negativeNumber();
            sideValue = input.getInt();
        }
        return sideValue;
    }
}
