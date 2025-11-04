package Hashing;
import java.util.*;

public class Union_and_Intersection {
    public static void union(int arr1[],int arr2[]){
        HashSet<Integer>uni= new HashSet<>();
        for (int i=0;i<arr1.length;i++){
           uni.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){
            uni.add(arr2[j]);
        }
        System.out.println(uni.size());
        System.out.println(uni);
        //iterator give me ehole arraay including duplicate

//        Iterator it=uni.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }

    //Intersection
    public static int Intersection(int arr1[],int arr2[]){
        HashSet<Integer>INT=new HashSet<>();
        int count=0;
        for (int i=0;i<arr1.length;i++){
            INT.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){
            if (INT.contains(arr2[j])){
                System.out.println(arr2[j]);//for Intersect element
                 count++;//for counting Intersection
                 INT.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        union(arr1,arr2);
        System.out.println(Intersection(arr1,arr2));
    }
}
//time complexity==>On
