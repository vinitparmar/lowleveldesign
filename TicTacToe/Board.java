package TicTacToe;

public class Board {
     private int size;
     private Cell[][] board;


     public Board(int size){
        this.size = size;
        board = new Cell[size][size];
        for(int i = 0; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                board[i][j] = new Cell(i, j);
            }
        }
     }

     public boolean placeMove(int row , int col , Symbol symbol){

        if(!board[row][col].isEmpty()){
            return false;
        }
        board[row][col].setSymbol(symbol);
        return true;
     }

     public Symbol getSymbol(int row, int col) {
        return board[row][col].getSymbol();
    }

    public int getSize() {
        return size;
    }

    public void printBoard() {

        for(int i=0;i<size;i++) {

            for(int j=0;j<size;j++) {
                System.out.print(board[i][j].getSymbol() + " ");
            }

            System.out.println();
        }
    }
}
