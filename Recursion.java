import java.util.*;
public class Recursion {
// fibonnaci
    // public static int fib(int n){
    //     if(n==0||n==1){
    //         return n;
    //     }
    // int ans=fib(n-1)+fib(n-2);
    // return ans;
    // }
    // // factorial
    // public static int fact(int n){
    //     int x=1;
    //     if(n==1){
    //         return n;
    //     }
    //      x=fact(n-1);
    //     return x*n ;
    // }
    // // print num
    // public static void printn(int n){
    //     if(n==0){
    //         return;
    //     }
    //     if(n%2!=0){
    //     System.out.println(n);
    //     }
    //  printn(n-1);
    //  if(n%2==0){
    //     System.out.println(n);
    //  }
    
    // }

    // //power 
    // public static int pow(int a,int b){
    //     if(b==0){
    //         return 1;
    //     }
    //     return a* pow(a, b-1);

    // }
    
    // count 0
    // public static int count0(int n,int count){
    //     if(n==0){
    //         return count;
    //     }
    //     if(n%10==0){
    //         count +=1;
    //     }
    //     return count0(n/10,count);
    // }

    // // n num sum
    // public static int sum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n+sum(n-1);
    // }

    // string  reverse

    // public static String rev(String str){
    //     if(str.length()==1){
    //         return str;
    //     }
        
    //      return rev(str.substring(1))+str.charAt(0);
    // }

    // public static void fun(int x){
    //     System.out.println(x);
    //     if(x>=3){
    //         return;
    //     }
    //     fun(x+1);
    //     fun(x+2);
    // }

    // pattern 1 

    // public static void print(int num){
    //     if(num==0){
    //         return ;
    //     }
    //     System.out.print("*");
    //     print(num-1);
    // }

    // public static void pattern1(int n,int i){
    //     //base con
    //     if(n==0){
    //         return;
    //     }
    //     print(i);
    //     System.out.println();
    //     pattern1(n-1, i+1);
    // }
    
    // // pattern 2

    // public static void print1(int num){
    //     if(num==0){
    //         return ;
    //     }
    //     System.out.print("*");
    //     print(num-1);
    // }

    // public static void pattern2(int n){
    //     //base con
    //     if(n==0){
    //         return;
    //     }
    //     print(n);
    //     System.out.println();
    //     pattern2(n-1);
    // }

    // // pattern 3

    // public static void print3(int num,int l){
    //     if(num==0){
    //         return;
    //     }
    //     System.out.print(l);
    //     print3(num-1,l+1);
    // }

    // public static void pattern3(int n,int i){
    //     if(n==0){
    //         return;
    //     }
    //     print3(i, i);
    //     System.out.println();
    //     pattern3(n-1, i+1);
    // }

    


    // public static boolean issorted(int arr[],int n,boolean issorted){
    //     if(n>=arr.length-1){
    //         return issorted;
    //     }
    //     if(arr[n]>arr[n+1]){
    //         return false;
    //     }
    //     if(arr[n]<=arr[n+1]){
    //         issorted=true;
    //     }
    //    // System.out.println(n);
    //    return issorted(arr,n+1,issorted);
        
    // }

    // // prime number

    public static boolean prime(int n,int i){
        if(i*i>=n){
            return true;
        }
        if(n%i==0){
        return false;
        }
      return prime(n,i+2);
    }

    // public static void isprime(int i,int n,int j){
    //   if(i>=n){
    //     return;
    //   }
    //   if(prime(i, n,j)){
    //     System.out.println(i);
    //   }
    //   isprime(i++, n, j);
    // }
    

    // public static void row(int i,int n){
    //  if(n==0){
    //   return;
    //  }
    //  System.out.print((char)i);
    //  row(i+1, n-1);
    // }

    // public static void col(int j,int i){
    //  if(i>=5){
    //   return;
    //  }
    
    //  row(j,i);
    //  System.out.println();
    //  col(j, i+1);
    // }
    // armstrong

// public static int count(int n,int count){
//     if(n==0){
//         return count;
//     }
//      return count(n/10,count+1);
// }

// public static boolean arm(int cpy,int n,boolean isarm,int rem,int sum){
//     if(n==0){
//         return isarm;
//     }
//     rem=n%10;
//     sum+=Math.pow(rem,3);
//     arm(cpy,n/10, isarm, rem, sum);
//     if(cpy==sum){
//         isarm=true;
//     }
//     return isarm;
// }

      public static void main(String[] args) {
       // System.out.println(fib(6));
      // System.out.println(fact(5));
    //  printn(5);
   // System.out.println(pow(2, 5));
   //System.out.println(count0(10001, 0));
  // System.out.println(sum(10));
String str="race";
//String revstr=rev(str);
  //System.out.print(revstr);
  //fun(0);public
 // pattern1(5, 1);
 //pattern2(5);

 //pattern3(5, 1);
  int arr[]={1,2,3,0};
 // int n=0;
 //System.out.println(issorted(arr, n,false));
//System.out.println(prime(11, false, 1));
// int n=153;
// int cpy=n;
// int count =0;
// int rem=0;
// int num=0;
// while(n!=0){
//     count++;
//     n=n/10;
// }
// while(cpy!=0){
//     rem=cpy%10;
// num+=Math.pow(rem, count);
// cpy=cpy/10;
// }
// if(n==cpy){
//     System.out.println("true");
// }
//     }
//System.out.println(count(153, 0));
//System.out.println(arm(153,153, false, 0, 0));
//System.out.println(prime(2,31));
// Scanner sc=new Scanner(System.in);
// char n=sc.nextLine().charAt(0);
// row('a', n);
//col(65, 1);
// char n='e';
// for(char i='a';i<=n;i++){
//   for(char j='a';j<=i;j++){
//     System.out.print(j);
//   }
//   System.out.println();
// }
//       }
//System.out.println(prime(2, 31));
System.out.println(prime(10, 2));
 }
}
