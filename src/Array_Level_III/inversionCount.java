package Array_Level_III;

import java.util.ArrayList;

public class inversionCount {
    //brute Approach.................................................
//    public static int inversionCount(int arr[]){
//       int n=arr.length;
//       int count=0;
//       for (int i=0;i<n;i++){
//           for (int j=i+1;j<n;j++){
//               if (arr[i]>arr[j]){
//                   count++;
//               }
//           }
//       }
//       return count;
//    }
//    public static void main(String[] args) {
//       int arr[] ={2, 4, 1, 3, 5};
//        System.out.println(inversionCount(arr));
//    }
    //Better Approach,..............................................................
    public static int sort(int arr[],int low ,int high){
        int count=0;
        if(low>=high){
            return count;
        }
        int mid=low+(high-low)/2;
        count+=sort(arr,low, mid);
        count+= sort(arr,mid+1,high);
        count+= merge(arr,low,mid,high);
        return count;
    }
    public static int merge(int arr[],int low, int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        int count=0;
        while(left<=mid && right<=high){
            if ((arr[left]<=arr[right])){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count+=(mid-left+1);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 3, 5};
        int n=arr.length;
        int low=0;
        int high=n-1;
        System.out.println( sort(arr,low,high));
    }
}
