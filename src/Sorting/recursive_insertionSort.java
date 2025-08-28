package Sorting;

public class recursive_insertionSort {
    public static void sort(int arr[],int n){
        if(n<=1){
            return;
        }
        int i=n-1;
       while(i>0 && arr[i-1]>arr[i]){
           int temp=arr[i-1];
           arr[i-1]=arr[i];
           arr[i]=temp;
           i--;
       }
        sort(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,6,3,8};
        int n=arr.length;
        sort(arr,n);
        for (int num:arr){
            System.out.println(num);
        }
    }
}
