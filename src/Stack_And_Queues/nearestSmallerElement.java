package Stack_And_Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class nearestSmallerElement {

    //Brute Approach..............................
//    public static List<Integer> smallerElement(int arr[]){
//        int n=arr.length;
//        List<Integer>nse=new ArrayList<>();
//        for (int  i=0;i<n;i++){
//            boolean found=false;
//            for (int j=i-1;j>=0;j--){
//
//                if (arr[j]<arr[i]) {
//                    nse.add(arr[j]);
//                    found=true;
//                    break;
//                }
//            }
//                if (!found){
//                    nse.add(-1);
//                }
//
//        }
//        return nse;
//    }

    //optimal Approach..................................
    public static List<Integer>smallerElement(int arr[]){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        List<Integer>nse=new ArrayList<>();
        for (int i=0;i<n;i++){
            while (!st.isEmpty() && arr[i]<st.peek()){
                st.pop();
            }
            if (st.isEmpty()){
                nse.add(-1);
            }
            else {
                nse.add(st.peek());
            }
            st.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,10,8};
        System.out.println(smallerElement(arr));
    }
}
