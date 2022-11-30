import java.util.ArrayList;

public class Dicepos {
    static ArrayList<String> dicepos(int src,int dest){

        if(src==dest){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        if(src>dest){
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int dice=1;dice<=6;dice++){
            int curr=dice+src;
            ArrayList<String> list=dicepos(curr, dest);
            for(String temp:list){
                ans.add(temp+dice);
            }
        }
        return ans;
    }

    


    public static void main(String[] args) {
       System.out.println(dicepos(0, 10));
    }
}
