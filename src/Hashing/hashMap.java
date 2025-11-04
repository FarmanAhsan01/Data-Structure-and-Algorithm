package Hashing;
import java.util.HashMap;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA",40);
        map.put("china",40);
        System.out.println(map);

        map.put("china",180);
        System.out.println(map);
        if (map.containsKey("china")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println(("keys is not present in the map"));
        }
        System.out.println(map.get("china"));
        System.out.println(map.get("indonesia"));
        //Iteration
//        Map.Entry<Integer,Integer>e:Map.entrySet();
        int arr[]={12,32,56};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for (int val:arr){
            System.out.println(val+" ");
        }
        //print only keys
        for (Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String>keys=map.keySet();
        //print both keys and values
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("china");
        System.out.println(map);
    }
}
