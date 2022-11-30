import java.util.*;
public class Maze {
        static ArrayList<String> mazepos(int startrow,int startcol,int endrow,int endcol){
        if(startrow==endrow && startcol==endcol){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        if(startrow>endrow||startcol>endcol){
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
           ArrayList<String> list= mazepos(startrow+1, startcol, endrow, endcol);
           for(String temp:list){
            ans.add(temp+"R");
           }
           list= mazepos(startrow, startcol+1, endrow, endcol);
           for(String temp:list){
            ans.add(temp+"D");
           }
           return ans;
    }
    public static void main(String[] args) {
        System.out.println(mazepos(0, 0, 2,2));
    }

}
