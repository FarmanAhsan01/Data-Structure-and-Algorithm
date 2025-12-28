package Stack_And_Queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class nextGreaterElement_ll {

    //Brute Approach........................................
//    public static List<Integer>nextGreater(int arr[]){
//        int n=arr.length;
//        List<Integer>nge=new ArrayList<>();
//        for (int i=0;i<n;i++){
//            boolean found=false;
//            for (int j=i+1;j<n;j++){
//                if (arr[j]>arr[i]){
//                    nge.add(arr[j]);
//                    found=true;
//                    break;
//                }
//            }
//            if (!found){
//                for (int j=0;j<i-1;j++){
//                    if (arr[j]>=arr[i]){
//                        nge.add(arr[j]);
//                        found=true;
//                        break;
//                    }
//                }
//            }
//            if (!found){
//                nge.add(-1);
//            }
//        }
//        return nge;
//    }


    //Better Approach......................................
//    public static List<Integer>nextGreater(int arr[]){
//        int n=arr.length;
//        List<Integer>nge=new ArrayList<>();
//        for (int i=0;i<n;i++){
//            boolean found=false;
//            for (int j=i+1;j<i+n-1;j++){
//                int ind=j%n;
//                if (arr[ind]>arr[i]){
//                    nge.add(arr[ind]);
//                    found=true;
//                    break;
//                }
//            }
//            if (!found){
//                nge.add(-1);
//            }
//        }
//        return nge;
//    }

    //optimal approach........................................
    public static List<Integer>nextGreater(int arr[]){
        int n=arr.length;
        List<Integer>nge=new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer>st=new Stack<>();
        for (int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if (i < n) {
                nge.set(i,st.isEmpty()?-1:st.peek());
            }
            st.push(arr[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int arr[]={2,10,12,1,11};
        System.out.println(nextGreater(arr));
    }
}
