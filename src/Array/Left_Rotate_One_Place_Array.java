package Array;
import java.util.Scanner;
public class Left_Rotate_One_Place_Array {
    public static void rotate(int arr[],int k){
        int n=arr.length;
        int temp=arr[0];
        for (int i=1;i<n;i++){
           arr[i-1]=arr[i];
        }
       arr[n-1]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]={1,2,3,4,5,6};
        rotate(arr,k);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
