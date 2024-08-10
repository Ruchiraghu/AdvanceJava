package tikTakToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        char[][] board = new char[3][3];
        for (int row=0;row<board.length;row++){
            for (int col=0;col<board[row].length;col++){
                board[row][col] =' ';
            }
        }
        char player ='x';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver){
            g.printBoard(board);
            System.out.println("Player "+player+" enter");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();

            if(board[row][col]==' ') {
                board[row][col] = player;
                gameOver = g.haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won: ");}
                else {
                    player = (player=='x')?'o':'x';
                }
            }else{
                System.out.println("Invalid move! try again");}
        }
        g.printBoard(board);
    }
}
