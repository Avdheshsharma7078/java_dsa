import java.util.*;
class Nqueen{
    static int n = 4;
    static char board[][] = new char[n][n];
    static void printnqueen(List<List<String>>Board){
        System.out.println(Board);
    }
    static void boardutil(char[][] board,List<List<String>>Board){
        String row="";
        List<String> Newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
               
            }
              Newboard.add(row);
        }
       Board.add(Newboard);
       printnqueen(Board);

    }

    static boolean issafe(int row, int col) {
        // up
        for (int i = row; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // left dig
        for (int i = row,j=col; i >= 0&&j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }   
        // right dig
        for (int i = row,j=col; i >= 0&&j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
    return true; 
    }

    static int countsol(int row) {
        int count = 0;
        if(row==board.length){
            List<List<String>>Board=new ArrayList<>();
            boardutil(board, Board);
            return 1;
        }
        for (int col = 0; col < board.length; col++) {
            if(issafe(row, col)){
            board[row][col] = 'Q';
            count = count + countsol(row + 1);
            board[row][col] = '.';
            }
        }
        return count;

    }

    public static void main(String[] args) {
       System.out.println( countsol(0));

    }
}