package Array;

import java.util.HashSet;

public class move_Zeroes {
    //brute approach.......................
    public static void moving(int arr2[],int l){
       HashSet<Integer>temp=new HashSet<>();
       int[] tem = new int[l];
       for(int i=0;i<l;i++){
           if (arr2[i]==0){
               arr2[i]=tem[i];
          }
       }
       for (int i=0;i< tem.length;i++){
           arr2[i]=tem[i];
           int nognz= tem.length;

       }
      for (int i=tem.length;i<l;i++){
          arr2[i]=0;
      }

    }


    //optimal approach......................
    public static void move(int arr[],int n){
        int j=-1;
        for (int i=0;i<n;i++){
           while(arr[i]==0){
              j=i;
              break;
           }
           for ( i=j+1;i<n;i++) {
               if (arr[i] != 0) {
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                   j++;
               }
           }
        }
    }
    public static void main(String[] args) {
//        int arr[]={0,3,0,4,5,6};
//        int n=arr.length;
//        move(arr,n);
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }

        //brute approach
        int arr2[]={3,0,4,0,2,6,7};
        int l=arr2.length;
        moving(arr2,l);
        for (int i=0;i<l;i++){
            System.out.println(arr2[i]);
        }
    }

}
