package Sorting;
import java.util.List;
public class selectionSort {
    public static void sort(int arr[],int n){


        for (int i=0;i<=n-2;i++){
            int min=i;
            for (int j=i;j<=n-1;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={5,3,6,8,1,2};
        int n=arr.length;
        sort(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
       }
//        int n=arr.length;
//
//        for (int i=0;i<=n-2;i++){
//            int min=i;
//            for (int j=i;j<=n-1;j++){
//                if (arr[j]<arr[min]){
//                    min=j;
//                }
//                int temp = arr[min];
//                arr[min] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
    }
}


