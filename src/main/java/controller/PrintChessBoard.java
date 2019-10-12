package controller;

import servise.InstructionAndParse;
import model.ChessBoard;

public class PrintChessBoard {
    ChessBoard board = new ChessBoard(InstructionAndParse.chessBoard("height"),
                                      InstructionAndParse.chessBoard("width"));

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
}
