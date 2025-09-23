package Array;

public class linearSearch {
    public static int search(int arr[],int n,int num){
        for (int i=0;i<n;i++){
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,5};
        int num=5;
        int n=arr.length;
        System.out.println(search(arr,n,num));
    }
}
