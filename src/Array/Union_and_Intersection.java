package Array;

import java.util.ArrayList;
import java.util.List;

public class Union_and_Intersection {
    //    public static ArrayList<Integer> union(int a[], int b[]){
//        ArrayList<Integer> l1=new ArrayList<>();
//        int n=a.length;
//        int s=b.length;
//        int i=0;
//      while(i<n) {
//              l1.add(a[i]);
//              i++;
//      }
//          for (int j = 0; j < s; j++) {
//              if (!l1.contains(b[j])) {
//                  l1.add(b[j]);
//              }
//          }
//        for(int x:l1){
//            System.out.print(x+" ");
//        }
//        return l1;
//    }
    //OPTIMAL APPROACH............................................
//    public static ArrayList<Integer> union(int a[], int b[]) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        int n1 = a.length;
//        int n2 = b.length;
//        int i = 0;
//        int j = 0;
//        while (i < n1 && j < n2) {
//            if (a[i] <= b[j]) {
//                if (l1.size() == 0 || l1.get(l1.size() - 1) != a[i]) {
//                    l1.add(a[i]);
//                }
//                i++;
//            } else {
//                if (l1.size() == 0 || l1.get(l1.size() - 1) != b[j]) {
//                    l1.add(b[j]);
//                }
//                j++;
//            }
//        }
//        while (i < n1) {
//            if (l1.size() == 0 || l1.get(l1.size() - 1) != a[i]) {
//                l1.add(a[i]);
//            }
//            i++;
//        }
//        while (j < n2) {
//            if (l1.size() == 0 || l1.get(l1.size() - 1) != b[j]) {
//                l1.add(b[j]);
//            }
//            j++;
//        }
//
//        return l1;
//    }
//
//    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5};
//        int b[] = {1, 2, 3};
//        ArrayList<Integer> result = union(a, b);
//        for (int x : result) {
//            System.out.println(x);
//        }
//    }
    //INTERSECTION.....................................
    //BRUTE APPROACH.................................
    public static ArrayList<Integer> Intersection(int a[], int b[]){
        ArrayList<Integer>result=new ArrayList<>();
       int n1= a.length;
       int n2=b.length;
        int temp[] = new int[n2];
       for (int i=0;i<n1;i++){
           for (int j=0;j<n2;j++){
               if (a[i] == b[j] && temp[j] != 1) {
                   result.add(a[i]);
                   temp[j]=1;
                   break;
               }
               if (b[j]>a[i]){
                   break;
               }
           }
       }
       return result;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,4,5,6};
        int b[]={2,3,3,5,6,6,7};
        System.out.println(Intersection(a,b));
    }

    //Optimal approach.....................................
//    public static ArrayList<Integer>intersection(int a[],int b[]){
//       ArrayList<Integer>l1=new ArrayList<>();
//       int i=0;
//       int j=0;
//       int n1=a.length;
//       int n2=b.length;
//       while(i<n1&&j<n2){
//            if (a[i]<b[j]){
//                i++;
//            } else if (b[j]<a[i]) {
//                j++;
//            }
//            else {
//                l1.add(a[i]);
//                i++;
//                j++;
//            }
//       }
//       return l1;
//    }
//
//    public static void main(String[] args) {
//        int a[]={1,2,2,3,3,4,5,6};
//        int b[]={2,3,3,5,6,6,7};
//        System.out.println(intersection(a,b));
//    }
}
