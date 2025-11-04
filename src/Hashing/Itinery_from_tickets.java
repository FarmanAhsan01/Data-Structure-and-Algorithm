package Hashing;
import java.util.HashMap;

public class Itinery_from_tickets {
    public static String starting(HashMap<String,String>tick){
        HashMap<String,String>rev=new HashMap<>();
        for(String key:tick.keySet()){
           rev.put(tick.get(key),key);
        }
        for (String key:tick.keySet()){
            if (!rev.containsKey(key)){
               return key;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("channai","Bangaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","channai");
        map.put("Delhi","Goa");

        String start=starting(map);
        while(map.containsKey(start)){
            System.out.println(start);
            start=map.get(start);
        }
        System.out.println(start);
    }
}
