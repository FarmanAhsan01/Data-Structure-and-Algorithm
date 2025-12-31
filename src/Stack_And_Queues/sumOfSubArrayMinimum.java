package Stack_And_Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class sumOfSubArrayMinimum {

    //Brute Approach...............................
//    public static int sumOfSubArray(int arr[]){
//        int n=arr.length;
//        int mod=(int)Integer.MAX_VALUE+7;
//        int sum=0;
//        for (int i=0;i<n;i++){
//            int mini=arr[i];
//            for (int j=i;j<n;j++){
//                 mini=Math.min(mini,arr[j]);
//                 sum=(sum+mini)%mod;
//            }
//        }
//        return sum;
//    }

    //optimal approach..............................................
    public static int sumOfSubArray(int arr[]){
        int n=arr.length;
        List<Integer> nse = findNSE(arr);
        List<Integer> pse=findPSE(arr);
        int total=0;
        int mod=(int)Integer.MAX_VALUE+7;
        for (int i=0;i<n;i++){
            int left=i-pse.get(i);
            int right=nse.get(i)-i;
            total=(total+(right*left*arr[i])%mod)%mod;
        }
        return total;
    }
    public static List<Integer> findNSE(int arr[]){
        int n=arr.length;
        List<Integer>nse=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for (int i=0;i<n;i++){
            while (!st.empty() && arr[st.peek()]>=arr[i]){
                st.pop();
                if (st.isEmpty()){
                    nse.add(-1);
                }
                else {
                    nse.add(st.peek());
                }
                st.push(i);
            }
        }
        return nse;
    }
    public static List<Integer> findPSE(int arr[]){
        int n=arr.length;
        List<Integer>psee=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for (int i=0;i<n;i++){
            while(st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
                    psee.set(i,st.isEmpty()?-1:st.peek());
            }
             st.push(i);
        }
        return psee;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        System.out.println(sumOfSubArray(arr));
    }
}
