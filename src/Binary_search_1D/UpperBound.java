package Binary_search_1D;

public class UpperBound {
    public static int lowerBound(int arr[],int k){
       int n=arr.length;
       int ans=-1;
       int low=0;
       int high=n-1;
       while(low<=high){
           int mid=(low+high)/2;
        if (arr[mid]<k){
            ans=mid;
            low=mid+1;
        }
        else {
            high=mid-1;
        }
    }
        return ans ;
}

    public static void main(String[] args) {
        int arr[]={1, 2, 8, 10, 11, 12, 19};
        int k=5;
        System.out.println(lowerBound(arr,k));
    }
}
