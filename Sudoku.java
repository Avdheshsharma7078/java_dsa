import javax.naming.spi.DirStateFactory.Result;

public class Sudoku {
    static int [][]board = {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
    static void print(){
        for(int i = 0; i< board.length;i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean caniplace(int row,int col,int value ){
        // value present in row or not
        for(int i=0;i<board.length;i++){
        if(board[row][i]==value){
            return false;
        }
        }


        //value present in col or not
        for(int i=0;i<board.length;i++){
            if(board[i][col]==value){
                return false;
            }
            }
        //value present in subgrid or not
       int  startrow=row-row%3;
       int startcol=col-col%3;
       for(int i=startrow;i<startrow+3;i++){
        for(int j=startcol;j<startcol+3;j++){
            if(board[i][j]==value)
            return false;
        }
       }
       return true;
    }

    public static boolean solvesudoku(int row,int col){
        // if col reach to end
        if(col==board.length){
            col=0;
            row=row+1;
        }
        // if raw reach to end
        if(row==board.length){
            return true;
        }
        // if cell is not empty
        if(board[row][col]!=0){
            return solvesudoku(row, col+1);
        }
        // if cell is empty
        for(int i=1;i<=board.length;i++){
            if(caniplace(row, col, i)){
        board[row][col]=i;
        boolean result=solvesudoku(row, col+1);
        if(result){
            return result;
        }
        board[row][col]=0;
    }
}
return false;
    }
    public static void main(String[] args) {
       boolean res= solvesudoku(0, 0);
       System.out.println(res);
       print();
    }
}
