package Binary_search_1D;

public class square_Root {
    //Brute Approach.......................................
//    public static int floorSqrt(int n){
//        int ans=1;
//        for(int i=1;i<=n;i++){
//            if(i*i<=n){
//                ans=i;
//            }
//            else{
//                break;
//            }
//        }
//        return ans;
//    }

    // Optimal Approach......................................
    public static int floorSqrt(int n){
        int low=1;int high=n;
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid*mid)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=11;
        System.out.println(floorSqrt(n));
    }
}
