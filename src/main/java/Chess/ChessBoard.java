package Chess;

public class ChessBoard {
    int height;
    int width;

    public  ChessBoard() {}

    public ChessBoard(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {return this.height;}

    public  int getWidth() {return this.width;}

    public void setHeight(int height) {this.height = height;}

    public void setWidth(int width) {this.width = width;}

    public void boardToScreen(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
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
