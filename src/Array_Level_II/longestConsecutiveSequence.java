package Array_Level_II;

import java.util.HashSet;

public class longestConsecutiveSequence {
    //Brute Approach ......................................................
//    public static  boolean ls(int arr[],int num){
//        int n=arr.length;
//        for (int i=0;i<n;i++){
//            if (arr[i]==num){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static int longConSequence(int arr[]){
//        int longest=1;
//        int n=arr.length;
//        int x=0;
//        int count=0;
//        for (int i=0;i<n;i++){
//             x=arr[i];
//             count=1;
//             while(ls(arr, x + 1) == true){
//                x=x+1;
//                count=count+1;
//             }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int arr[]={102,4,100,1,101,3,2,1,1};
//        System.out.println(longConSequence(arr));
//    }
    // Better Approach....................................................................
//    public static int longConSequence(int arr[]){
//        int lastSmaller=Integer.MIN_VALUE;
//        int count=0;
//        int n=arr.length;
//        int longest=0;
//        for (int i=0;i<=n-1;i++){
//            int j=i;
//            while(j>0 && arr[j-1] > arr[j]){
//                int temp=arr[j-1];
//                arr[j-1]=arr[j];
//                arr[j]=temp;
//                j--;
//            }
//        }
//        for (int i=0;i<n;i++){
//            if (arr[i]-1==lastSmaller){
//                count=count+1;
//                lastSmaller=arr[i];
//            }
//            else if (arr[i]!=lastSmaller){
//                count=1;
//                lastSmaller=arr[i];
//            }
//            longest=Math.max(longest,count);
//        }
//        return longest;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
//        System.out.println(longConSequence(arr));
//    }

    //Optimal Approach............................................
    public static int longConSequence(int arr[]){
        int n=arr.length;
        int longest=0;
        if (n==0){
            return 0;
        }
        HashSet<Integer>l1=new HashSet<>();
        for (int i=0;i<n;i++){
            l1.add(arr[i]);
        }
        for (int it:l1){
            if (!l1.contains(it-1)) {
                int count = 1;
                int x = it;
                while (l1.contains(x + 1)) {
                    x = x + 1;
                    count=count+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[]={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(longConSequence(arr));
    }
}
