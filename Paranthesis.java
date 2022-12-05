import java.util.ArrayList;
import java.util.*;
public class Paranthesis {

    static List<String> generate(int n){
        List<String> output = new ArrayList<>();
        helper(output, "", 0, 0, n);
        return output;
    }
        static void helper(List<String> ans,String currBracket,int open,int close,int max){
            if(currBracket.length()==max*2){
                ans.add(currBracket);
                return;
            }
            if(open<max){
                helper(ans, currBracket+"(", open+1, close, max);
            }
            if(close<open){
                helper(ans, currBracket+")", open, close+1, max);
            }
        }


    
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
