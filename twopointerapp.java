import java.util.ArrayList;

public class twopinterapp {
//    public static void reverse(int arr[]){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]);
//         }
//     }


    // public static void pairsum(int arr[],int target){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==target)
    //             {
    //                 System.out.println(i+","+j);
    //             }
    //         }
    //     }
    // }

    // 2nd apporach
    // public static void pairsum(int arr[],int target){
    //     int j=1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]+arr[j]==target){
    //             System.out.println(i+","+j);
    //         }else{
    //             j++;
    //         }
            
    //     }
    // }

    // 3rd approach

    //      public static void pairsum(int arr[],int target){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<arr.length;i++){
    //     if(map.get(arr[i])==null){
    //         map.put(target-arr[i],arr[i]);
    //     }else{
    //         System.out.println(map.get(arr[i])+","+arr[i]);
    //     }
    // }

    //      }



        // leader num

        public static void leader(int arr[]){
            System.out.println(arr[arr.length-1]);
            int i=0;
                int j=arr.length-2;
                while(j>=i){
                    if(arr[i]>arr[j]){
                       j=j-1 ;
                    }
                    
                    if(i==j){
                        System.out.println(arr[i]);
                        j=arr.length-2;
                        i++;
                    }
                    if(arr[i]<arr[j]){
                        i++;
                        j=arr.length-2;
                    }
                }
            }
        
            // duplicate

//         public static void duplicate(int nums[]){ 
//             int i=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]!=nums[i]){
//                     i++;
//                     nums[i]=nums[j];
//                 }
    
//             }     
//             for(int j=0;j<=i;j++){
//                 System.out.print(nums[j]+", ");
//             }            
// }
    public static void main(String[] args) {
        int arr[]={10,9,1,8,7,6};
       // reverse(arr);
      // pairsum(arr, 7);
      int n=arr.length;
      //duplicate(arr);
      leader(arr);
    }
}

