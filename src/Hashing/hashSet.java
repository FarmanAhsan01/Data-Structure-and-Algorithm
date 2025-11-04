package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer>Set=new HashSet<>();
        //add Element
        Set.add(1);
        Set.add(2);
        Set.add(4);
        Set.add(5);
        //contain yes or not
        if (Set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!Set.contains(6)){
            System.out.println("does not contain");
        }
        //print whole set
        System.out.println(Set);
        //remove
        Set.remove(1);
        System.out.println(Set);
        //size of the set
        System.out.println("size of the set "+Set.size());
        //iterator
        Iterator it =Set.iterator();
        System.out.println(it.next());//give me next element
        System.out.println(it.hasNext());//give boolean true and false
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
