package Stack_And_Queues;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class nextGreaterElement {

    //Brute Approach..........................................

//    public static List<Integer> nextGreater(int arr[]){
//        int n=arr.length;
//        List<Integer>nge=new ArrayList<>();
//        for (int i=0;i<n;i++){
//            int next=-1;
//            for (int j=i+1;j<n;j++){
//                if (arr[j]>arr[i]){
//                    next=arr[j];
//                    break;
//                }
//            }
//            nge.add(next);
//        }
//        return nge;
//    }

    //optimal Approach..........................................

    public static List<Integer> nextGreater(int arr[]){
        int n=arr.length;
        List<Integer>nge=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for (int i=n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge.add(-1);
            }
            else {
                nge.add(st.peek());
            }
            st.push(arr[i]);

        }
        Collections.reverse(nge);
        return nge;
    }

    public static void main(String[] args) {
        int arr[]={4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println(nextGreater(arr));
    }


}
