package Array;
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;

//public class Left_Rotate_the_Array {
//    public static  void leftRotate(int arr[],int d){
//        HashSet<Integer>list=new HashSet<>();
//        int[] temp = new int[d];
//        int n=arr.length;
//        //shifting
//        for(int i=d;i<n;i++){
//            arr[i-d]=arr[i];
//        }
//        int j=0;
//        for (int i=n-d;i<n;i++){
//            arr[i]=temp[j];
//            j++;
//        }
//        //or
////        for (int i=n-d;i<n;i++){
////            arr[i]=temp[i-(n-d)];
////        }
//        for (int set:list){
//            System.out.println(list.add(set));
//        }
//
//
//    }
//    public static void main(String[] args) {
//        //Brute Approach............................
//      Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter the element of the array");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter the number of times to rotate");
//        int d=sc.nextInt();
//         d=d%n;
//        leftRotate(arr,d);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//    }
//}



//public class Left_Rotate_the_Array {
//    public static void leftRotate(int arr[], int d) {
//        int n = arr.length;
//
//        // Ensure d is within bounds
//        d = d % n;
//
//        // Create the temp array dynamically to store the first d elements
//        int[] temp = new int[d];
//        for (int i = 0; i < d; i++) {
//            temp[i] = arr[i];
//        }
//
//        // Shift the remaining elements to the left
//        for (int i = d; i < n; i++) {
//            arr[i - d] = arr[i];
//        }
//
//        // Copy elements from temp to the end of the array
//        for (int i = 0; i < d; i++) {
//            arr[n - d + i] = temp[i];
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input the array size
//        System.out.print("Enter the size of the array: ");
//        int n = scanner.nextInt();
//
//        int[] arr = new int[n];
//
//        // Input array elements
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        // Input the number of rotations
//        System.out.print("Enter the number of times to rotate (d): ");
//        int d = scanner.nextInt();
//
//        // Call the leftRotate function
//        leftRotate(arr, d);
//
//        // Print the rotated array
//        System.out.println("Rotated Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        scanner.close();
//    }
//}
public class Left_Rotate_the_Array{
    public static  void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    //for left rotation
//    public static void leftRotate(int arr[],int k){
//        int n=arr.length;
//        reverse(arr,0,k-1);
//        reverse(arr,k,n-1);
//        reverse(arr,0,n-1);
//    }
    //for right rotation
    public static  void right(int arr[], int k){
        int n=arr.length;
        if (n <= 1) return; // Handle edge case: single-element array

//        k %= n; // Ensure k is within bounds
        if (k == 0) return;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
//        leftRotate(arr,k);
        right(arr,k);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}

