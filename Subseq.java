public class Subseq {

    // find subseq
    public static void findsubseq(String str,String ans,int i){
        if(i>=str.length()){
        
            System.out.println(ans);
            return;
        }
        findsubseq(str, ans+str.charAt(i), i+1);
        findsubseq(str, ans, i+1);

        }
    
        // find permutation

        public static void findpermutation(String str,String ans){
            // base case
            if(str.length()==0){
                System.out.println(ans);
                return;
            }
            // recursion
            for(int i=0;i<str.length();i++){
                char curr=str.charAt(i);
                //abcde=ab+de if we do this then c is deleted from abcde
          String  newstr=str.substring(0,i)+str.substring(i+1,str.length());
            findpermutation(newstr, ans+curr);
            }
        }
public static void main(String[] args) {
    

       // findsubseq("abc","", 0);
       findpermutation("abc","");
    }

}
