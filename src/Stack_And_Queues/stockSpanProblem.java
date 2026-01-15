package Stack_And_Queues;

import java.util.Stack;

public class stockSpanProblem {

    //Brute Approach............................................

//    public static int[] stockSpan(int arr[],int n){
//        int ans[]=new int[n];
//        for (int i=0;i<n;i++){
//            int currSpan=0;
//            for (int j=i;j>=0;j--){
//                if (arr[j]<=arr[i]){
//                    currSpan++;
//                }
//                else {
//                    break;
//                }
//            }
//            ans[i]=currSpan;
//        }
//
//        return ans;
//    }

    //Optimal Approach..................................
    public static int [] findPge(int[] arr){
        int n=arr.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            int currEle=arr[i];
            while(!st.isEmpty() &&  arr[st.peek()]<=currEle){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);

        }
        return ans;
    }
    public static int [] stockSpan(int arr[],int n){
        int [] pge=findPge(arr);
        int ans[]=new int[n];
        for (int i=0;i<n;i++){
            ans[i]=i-pge[i];
        }
        return ans;


    }
    public static void main(String[] args) {
        int n=7;
        int arr[]={7,2,1,3,3,1,8};
        int ans[]=stockSpan(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
