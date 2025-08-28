package Sorting;

public class insertionSort {
    public static void sort(int arr[],int n){
        for (int i=0;i<=n-1;i++){
           int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={14,9,15,12,6,8,13};
        int n=arr.length;
        sort(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
