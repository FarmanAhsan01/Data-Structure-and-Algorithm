package Recursion;
class Lution {

    public void reverseArray(int arr[],int start,int end) {
        if(start>=end){
            return;
        }
       int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr,start+1,end-1);
    } 
}
public class Recursion_reverse_an_array {

    public static void main(String[] args) {
        int[] arr={2,4,5,6,7};
        Lution farry=new Lution();
        farry.reverseArray(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
