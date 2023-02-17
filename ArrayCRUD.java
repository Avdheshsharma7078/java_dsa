public class ArrayCRUD{

    int arr[];
    int currentsize;
    public ArrayCRUD(int n){
        this.arr=new int[n];
        this.currentsize=0;
    }


    public void delete(int index){
        if(currentsize==0){
            System.out.println("empty");
        }
        int temp=arr[index];
        System.out.println("Deleted element"+temp);
        for(int i=index;i<currentsize-1;i++){
            arr[i]=arr[i+1];
        }
        arr[currentsize-1]=0;
        currentsize--;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void insert(int index,int item){
        if(index>currentsize){
            System.out.println("index can not be greater ");
            return;
        }
        for(int i=currentsize;i>index;i--){
            arr[i]=arr[i-1];
            
        }
        arr[index]=item;
        currentsize++;
        System.out.println("elemeent added");
    }

    void print(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    //2nd largest

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

    public static void main(String[] args) {
        int arr[]={1,3,4,5};
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//  int z;
//         for(int j=max;j>0;j--){
//             for(z=0;z<arr.length;z++){
//                 if(j>=arr[z]){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print(" \t");
//                 }

//             }
//             System.out.println();
//         }
        

//     }
//secondmax(arr);
ArrayCRUD obj=new ArrayCRUD(5);
obj.insert(0,5);
obj.insert(1,10);
obj.insert(2,20);
obj.insert(3,30);
obj.insert(1,30);

// obj.print();
obj.delete(2);
}
}