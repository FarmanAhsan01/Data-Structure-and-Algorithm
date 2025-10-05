package Array_Level_III;

import java.util.HashMap;

public class count_Number_subArray_with_Xor_k {
  //Brute Approach.........................................
//    public static int cntXorK(int A[],int B){
//        int n=A.length;
//        int count=0;
//        for (int i=0;i<n;i++){
//            for (int j=i;j<n;j++){
//                int xor=0;
//                for (int k=i;k<=j;k++){
//                    xor=xor^A[k];
//                }   if (xor==B){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int A[]={4,2,2,6,4};
//        int B=6;
//        System.out.println(cntXorK(A,B));
//    }


  // Better Approach............................................
//  public static int cntXorK(int A[],int B){
//    int n=A.length;
//    int count=0;
//    for(int i=0;i<n;i++){
//      int xor=0;
//      for (int j=i;j<n;j++){
//        xor=xor^A[j];
//        if (xor==B){
//          count++;
//        }
//      }
//    }
//    return count;
//  }
//  public static void main(String[] args) {
//    int A[]={4,2,2,6,4};
//    int B=6;
//    System.out.println(cntXorK(A,B));
//  }
  //Optimal Approach..............................................
  public static int cntXork(int A[],int B) {
    int n= A.length;
    int xr=0;
    HashMap<Integer,Integer>Mpp=new HashMap<>();
     Mpp.put(xr,1);
    int count=0;
    for (int i=0;i<n;i++){
      xr=xr^A[i];
       int x=xr^B;
        if (Mpp.containsKey(x)){
          count+=Mpp.get(x);
        }
        if (Mpp.containsKey(xr)){
          Mpp.put(xr, Mpp.get(xr) + 1);
        }
        else {
          Mpp.put(xr,1);
        }
        //another Approach
    //  Mpp.put(xr, Mpp.getOrDefault(xr, 0) + 1);

    }
    return count;
  }
  public static void main(String[] args) {
    int A[]={4,2,2,6,4};
    int B=6;
    System.out.println(cntXork(A,B));
  }
}
