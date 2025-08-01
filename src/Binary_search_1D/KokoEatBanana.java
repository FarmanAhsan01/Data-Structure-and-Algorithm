package Binary_search_1D;

public class KokoEatBanana {

    //Brute Approach....................................................................
//    public static int max(int piles[]){
//        int maxi = Integer.MIN_VALUE;;
//        int n = piles.length;
//        //find the maximum:
//        for (int i = 0; i < n; i++) {
//            maxi = Math.max(maxi, piles[i]);
//        }
//        return maxi;
//    }
//    public static int func(int piles[],int hourly){
//        int n=piles.length;
//        int totalhrs=0;
//        for (int i=0;i<n;i++){
//            totalhrs+=Math.ceil((double)(piles[i])/(double)(hourly));
//        }
//        return totalhrs;
//    }
//    public static int minHour(int piles[],int h){
//        int maxi=max(piles);
//        for (int i=0;i<maxi;i++){
//            int reqTime=func(piles,i);
//            if (reqTime<=h){
//                return i;
//            }
//        }
//        return maxi;
//    }
//    public static void main(String[] args) {
//        int[] v = {7, 15, 6, 3};
//        int h = 8;
//        int ans = minHour(v, h);
//        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
//    }

    //Optimal Approach....................................................................
    public static int max(int piles[]){
        int maxi = Integer.MIN_VALUE;;
        int n = piles.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }
    public static int func(int piles[],int hourly){
        int n=piles.length;
        int totalhrs=0;
        for (int i=0;i<n;i++){
            totalhrs+=Math.ceil((double)(piles[i])/(double)(hourly));
        }
        return totalhrs;
    }
    public static int minHour(int piles[],int h){
        int low=1;int high=max(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalhrs=func(piles,mid);
            if (totalhrs<=h){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minHour(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
