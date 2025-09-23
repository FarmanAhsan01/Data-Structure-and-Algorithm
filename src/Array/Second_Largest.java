package Array;

public class Second_Largest {
    public static void main(String[] args) {

        //brute approach
//        int arr[] = {3, 2, 8, 8, 8, 6};
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        int largest=arr[n-1];
//        int secondLargest=-1;
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]!=largest){
//                secondLargest=arr[i];
//                break;
//            }
//        }
//        System.out.println(secondLargest);


        //Better Approach
        int arr[]={4,8,7,2,8,8};
        int largest=arr[0];
        int sLargest=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i] > sLargest && arr[i] != largest) {
               sLargest=arr[i];
            }
        }
        System.out.println(sLargest);
        // Optimal approch

//        int arr2[]={4,7,2,9,6,2};
//        int n1=arr2.length;
//        int largest=arr2[0];
//        int sLargest=-1;
//        for (int i=1;i<n1;i++){
//            if (arr2[i]>largest){
//                sLargest=largest;
//                largest=arr2[i];
//            } else if (arr2[i]<largest && arr2[i]>sLargest) {
//                sLargest=arr2[i];
//            }
//        }
//        System.out.println(sLargest);
   }

}








