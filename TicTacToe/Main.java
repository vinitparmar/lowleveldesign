package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Player p1 = new Player("Player1", Symbol.X);
        Player p2 = new Player("Player2", Symbol.O);

        Game game = new Game(3, p1, p2);

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Enter row and column:");

            int row = sc.nextInt();
            int col = sc.nextInt();

            game.playMove(row,col);
        }
    }
}
