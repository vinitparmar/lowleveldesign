package TicTacToe;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    private Player currentPlayer;


    public Game(int size, Player p1, Player p2) {

        board = new Board(size);
        player1 = p1;
        player2 = p2;
        currentPlayer = player1;
    }



    public void playMove(int row , int col){

        boolean success = board.placeMove(row, col, currentPlayer.getSymbol());

        if(!success){
            System.out.println("invalid move");
            return;
        }

        board.printBoard();

       if(checkWinner(row,col)) {

            System.out.println(currentPlayer.getName() + " wins!");

            System.exit(0);
        }

        switchPlayer();
    }


    private void switchPlayer() {

        if(currentPlayer == player1)
            currentPlayer = player2;
        else
            currentPlayer = player1;
    }
    
     private boolean checkWinner(int row, int col) {

        Symbol symbol = currentPlayer.getSymbol();
        int size = board.getSize();

        boolean rowWin = true;
        boolean colWin = true;

        for(int i=0;i<size;i++) {

            if(board.getSymbol(row,i) != symbol)
                rowWin = false;

            if(board.getSymbol(i,col) != symbol)
                colWin = false;
        }

        boolean diag1 = true;
        boolean diag2 = true;

        for(int i=0;i<size;i++) {

            if(board.getSymbol(i,i) != symbol)
                diag1 = false;

            if(board.getSymbol(i,size-i-1) != symbol)
                diag2 = false;
        }

        return rowWin || colWin || diag1 || diag2;
    }
}
