import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phoneno {
  static  List<String> result=null;
  static  String[] map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits){
        result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        helper(0,digits,new StringBuilder());
        return result;
    }
   static void helper(int len,String digits,StringBuilder temp){
        if(len==digits.length()){
            result.add(temp.toString());
            return;
        }
        char ch=digits.charAt(len);
        String str=map[ch-'0'];
        for(char c:str.toCharArray()){
            temp.append(c);
            helper(len+1, digits, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static void main(String[] args) {
        // HashMap<Integer,String>map=new HashMap<>();
        System.out.println(letterCombinations("29"));
    }
}
