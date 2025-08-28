package Sorting;

public class bubbleSort {
    public static void sort(int arr[],int n){
        for (int i=n-1;i>=1;i--){
            int didSwap=0;
          for (int j=0;j<=i-1;j++){
              if (arr[j]>arr[j+1]){
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
                  didSwap=1;
              }
          }
          if(didSwap==0){
              break;
          }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,7,2,3,1};
        int n=arr.length;
        sort(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
