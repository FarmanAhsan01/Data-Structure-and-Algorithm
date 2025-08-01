package Binary_Search_ll_Level;

public class minimum_no_Of_days_tomake_M_bauquets {
//    public static boolean mBouguets(int []bloomDay,int day,int m,int k){
//        int count=0;int noOfBloom=0;
//        int n=bloomDay.length;
//        for (int i=0;i<n;i++){
//            if (bloomDay[i]<=day){
//                count++;
//            }
//            else {
//                noOfBloom+=(count/k);
//                count=0;
//            }
//        }
//        noOfBloom+=(count/k);
//        return noOfBloom>=m;
//    }
//    public static int roseGarden(int bloomDay[],int k,int m){
//        long val=(long)m*(long)k;
//        int n=bloomDay.length;
//        if (val>n) return -1;
//        int mini=Integer.MAX_VALUE , maxi=Integer.MIN_VALUE;
//        for (int i=0;i<n;i++){
//            mini=Math.min(mini,bloomDay[i]);
//            maxi=Math.max(maxi,bloomDay[i]);
//        }
//        for (int i=mini;i<=maxi;i++){
//            if (mBouguets(bloomDay,i,m,k)){
//                return i;
//            }
//        }
//        return -1;
//    }
    public static Boolean mBauquets(int bloomDay[],int Day,int k,int m ){
        int n=bloomDay.length;
        int count=0;int noOfBloom=0;
        for (int i=0;i<n;i++){
          if (bloomDay[i]<=Day){
              count++;
          }
          else {
              noOfBloom+=(count/k);
              count=0;
          }
        }
       noOfBloom+=(count/k);
        return noOfBloom>=m;
    }
    public static int roseGarden(int bloomDay[],int k,int m){
        long val=(long)k*(long)m;
        int n=bloomDay.length;
        if (val>n){
            return -1;
        }
        int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int low=min;int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if (mBauquets(bloomDay,mid,k,m)==true){
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}

