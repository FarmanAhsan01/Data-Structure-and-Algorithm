package Sorting;

public class quickSort {
//    public static void sort(int arr[],int low ,int high){
//        if(low<high){
//            int pIndex=partition(arr,low,high);
//            sort(arr,low,pIndex-1);
//            sort(arr,pIndex+1,high);
//        }
//    }
//    static int partition(int arr[], int low, int high){
//            int pivot=arr[low];
//            int i=low;
//            int j=high;
//            while(i<j){
//                while(arr[i]<=pivot &&i<=high-1 ){
//                    i++;
//                }
//                while(arr[j]>pivot&&j>=low+1){
//                    j--;
//                }
//                if(i<j){
//                    int temp=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//            }
//        int temp=arr[j];
//        arr[j]=arr[low];
//        arr[low]=temp;
//
//        return j;
//    }


    //Descending Order...................................................
    public static void sort(int arr[],int low ,int high){
        if(low<high){
            int pIndex=partition(arr,low,high);
            sort(arr,low,pIndex-1);
            sort(arr,pIndex+1,high);
        }
    }
    static int partition(int arr[], int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]>=pivot &&i<=high-1 ){
                i++;
            }
            while(arr[j]<pivot&&j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[]={3,2,5,1,8,5};
        int n=arr.length;
        int low=0;
        int high=n-1;
        sort(arr,low,high);
        for(int num:arr){
            System.out.println(num);
        }

    }
}
