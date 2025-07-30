package Binary_search_1D;
import java.util.*;

public class how_many_array_hasbeen_Rotated {
    public static int findRotation(List<Integer>arr){
        int n=arr.size();
        int low=0;int high=n-1;
        int min=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
           int mid=low+(high-low)/2;
           //for duplicate array.........
            if (arr.get(low)==arr.get(mid)&&arr.get(mid)==arr.get(high)){
                if (arr.get(low)<min){
                    low=low+1;
                    high=high-1;
                    continue;
                }
            }
           if (arr.get(low)<= arr.get(mid)){
               if (arr.get(low)<min){
                   index=low;
                   min=arr.get(low);
               }
               low=mid+1;
           }
           else {
               if (arr.get(mid)<min){
                   index=mid;
                   min=arr.get(mid);
               }
               high=mid-1;
           }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(4);
        temp.add(1);
        temp.add(4);
        temp.add(4);
        temp.add(4);
        System.out.println(findRotation(temp));
    }
}
