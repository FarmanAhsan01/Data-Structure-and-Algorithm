package Binary_search_1D;

public class findNthRootOfM {
    //brute Approach........................................
//    public static long fun(int b,int exp){
//        long  ans = 1;
//        long base = b;
//        while (exp > 0) {
//            if (exp % 2 == 1) {
//                exp--;
//                ans = ans * base;
//            } else {
//                exp /= 2;
//                base = base * base;
//            }
//        }
//        return ans;
//    }
//    public static int nRootM(int n,int m){
//        for (int i=0;i<=m;i++){
//            if (fun(i,n)==(long)m){
//                return i;
//            } else if (fun(i,n)>(long)m) {
//               break;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//      int n=2;
//      int m=9;
//      System.out.println(nRootM(n,m));
//    }
    //Optimal Approach..................................................
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public static int NthRoot(int n,int m){
        int low=1;int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if (func(mid,n,m)==1){
                return mid;
            }
            else if (func(mid,n,m)==0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}
