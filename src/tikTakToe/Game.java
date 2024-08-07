package tikTakToe;

public class Game {


    public static void printBoard(char[][] board) {
        for (int row = 0;row<board.length;row++){
            for (int col =0;col<board[row].length;col++){
                System.out.print(board[row][col]+"|");
            }
            System.out.println();
        }
    }
    public static boolean haveWon(char[][] board, char player){
        //row
        for (int row = 0;row <board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        //column
        for (int col=0;col<board.length;col++){
            if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                return true;
            }
        }
        //diagonal
                if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
                    return true;
        }
                if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
                    return true;
                }
                return false;
    }
}
