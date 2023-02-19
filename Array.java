public class Array {

    public static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }
    public static int min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void secondmax(int arr[]){
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                     max=arr[i];
                 }
              }
           for(int i=0;i<arr.length;i++){
              if(max!=arr[i]){
                if(arr[i]>max2){
                    max2=arr[i];
                }

              }
            }
            System.out.println(max2);
    }
    

    // bar char question
public static void bar(int arr[]){
    int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
     int z;
            for(int j=max;j>0;j--){
                for(z=0;z<arr.length;z++){
                    if(j<=arr[z]){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print(" \t");
                    }
    
                }
                System.out.println();
            }
            
        }
     // span problem

     public static void span(int arr[]){
        int max=max(arr);
        System.out.println(max);
        int min=min(arr);
        System.out.println(min);
        int span=max-min;
        System.out.println(span);

     }
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
//secondmax(arr);
//max(arr);
//bar(arr);
span(arr);
    }
}