package Sorting;
public class recursive_bubbleSort {
//    public static void sort(int arr[],int n){
//        if(n==1){
//            return;
//        }
//        for (int i=0;i<n-1;i++){
//
//            if(arr[i]>arr[i+1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//
//            }
//            sort(arr,n-1);
//
//        }
//
//    }

    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        sort(arr, arr.length);
    }  // code h
        public static void sort(int arr[],int n){


            if(n==1){

                return;
            }
            for (int i=0;i<n-1;i++){

                if(arr[i]>arr[i+1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                }



                sort(arr,n-1);

            }

        }






    public static void main(String[] args) {
        int arr[]={4,2,5,2,7,6,2};
        int n=arr.length;
//        sort(arr,n);
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
