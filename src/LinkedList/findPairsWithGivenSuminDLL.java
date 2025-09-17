package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class findPairsWithGivenSuminDLL {
    public static Nodes convert2DLL(int arr[]){
        Nodes head=new Nodes(arr[0]);
        Nodes prev=head;

        for (int i=1;i<arr.length;i++){
            Nodes temp=new Nodes(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
//    Brute Approach.............................
//    public static  HashMap<Integer, Integer> findpairOfSum(Nodes head,int sum){
//        Nodes temp1=head;
//        HashMap<Integer,Integer>map=new HashMap<>();
//        while (temp1!=null){
//            Nodes temp2=temp1.next;
//            while (temp2!=null && temp1.data+temp2.data<=sum){
//                if (temp1.data+temp2.data==sum){
//                    map.put(temp1.data,temp2.data);
//                }
//                temp2=temp2.next;
//            }
//            temp1=temp1.next;
//        }
//        return map;
//    }

//    Optimal Approach............................
    public  static Nodes tail(Nodes head){
        Nodes temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static HashMap<Integer,Integer>findpairOfSum(Nodes head,int sum){
        Nodes temp1=head;
        Nodes temp2=tail(head);
        HashMap<Integer,Integer>map=new HashMap<>();
        while (temp1.data<temp2.data){
            if (temp1.data+temp2.data==sum){
                map.put(temp1.data,temp2.data);
                temp1=temp1.next;
                temp2=temp2.back;
            }
            else if (temp1.data+temp2.data<sum) {
                temp1=temp1.next;
            }
            else {
                temp2=temp2.back;
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9};
        int key=5;

        Nodes head=convert2DLL(arr); HashMap<Integer, Integer> pairs = findpairOfSum(head, key);

        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            System.out.println(entry.getKey() + " + " + entry.getValue() + " = " + key);
        }
    }
}
