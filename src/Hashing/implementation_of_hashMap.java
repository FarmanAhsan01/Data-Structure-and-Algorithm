package Hashing;
import java.util.*;
//public class hashMapCode{
//    static class HashMap<k,v>{//generics
//        private class Node{
//            k key;
//            v Value;
//            public Node(k keys,v value){
//                this.key=key;
//                this.Value=Value;
//            }
//        }
//        private int n;//total no of nodes
//        private  int N;//total no of buckets
//        private LinkedList<Node>buckets[];//array type is linkedlist Node
//        @SuppressWarnings("unchecked")
//        public HashMap(){
//            this.N=4;
//            this.buckets=new LinkedList[4];
//            for (int i=0;i<4;i++){
//                this.buckets[i]=new LinkedList<>();
//            }
//        }
//        public int hashFunction(k key){
//            int bi=key.hashCode();
//            return Math.abs(bi)%N;
//        }
//        public int searchInAll(k key, int bi){
//            LinkedList<Node> l1= buckets[bi];
//            for(int i=0;i<l1.size();i++){
//                if(l1.get(i).key==key){
//                    return i;
//                }
//            }
//            return -1;
//        }
//        private void rehash(){
//            LinkedList<Node>oldBuckets[]=buckets;
//            buckets=new LinkedList[N*2];
//            for (int i=0;i<N*2;i++){
//                buckets[i]=new LinkedList<>();
//            }
//            for (int i=0;i< oldBuckets.length;i++){
//                LinkedList<Node>l1=oldBuckets[i];
//                for (int j=0;j< l1.size();j++){
//                    Node node=l1.get(j);
//                    put(node.key,node.Value);
//                }
//
//            }
//        }
//        public void put(k key,v value){
//            int bi=hashFunction(key);
//            int di=searchInAll(key,bi);
//            if(di==-1){
//                buckets[bi].add(new Node(key,value));
//                n++;
//            }
//            else{
//                Node node=buckets[bi].get(di);
//                node.Value=value;
//            }
//            double lambda=(double)n/N;
//            if(lambda>2.0){
//                rehash();
//            }
//        }
//
//        public boolean containsKey(k keys){
//            int bi=hashFunction(keys);
//            int di=searchInAll(keys,bi);
//            if(di==-1){
//                return false;
//            }
//            else{
//                return true;
//            }
//        }
//        public v remove(k key){
//            int bi=hashFunction(key);
//            int di=searchInAll(key,bi);
//            if(di==-1){
//                return null;
//            }
//            else{
//                Node node=buckets[bi].remove(di);
//                return node.Value;
//            }
//        }
//        public v get(k key){
//            int bi=hashFunction(key);
//            int di=searchInAll(key,bi);
//            if(di==-1){
//                return null;
//            }
//            else{
//                Node node=buckets[bi].get(di);
//                return node.Value;
//            }
//        }
//        public ArrayList<k> keySet(){
//            ArrayList<k>keys=new ArrayList<>();
//            for (int i=0;i<buckets.length;i++){
//                LinkedList<Node>l1=buckets[i];
//                for (int j=0;j<l1.size();j++){
//                    Node node=l1.get(j);
//                    keys.add(node.key);
//                }
//            }
//            return keys;
//        }
//        public boolean isEmpty(){
//            return n==0;
//        }
//
//    }
//}
//public class implementation_of_hashMap {
//    public static void main(String[] args){
//        HashMap<String,Integer>l1=new HashMap<>();
//        l1.put("switzerland",120);
//        l1.put("India",100);
//        l1.put("canada",50);

//        ArrayList<String> l2=l1.keySet();
//        for (int i=0;i<l2.size();i++){
//            System.out.println(l2.get(i)+" "+l1.get(l2.get(i)));
//        }
//    }
//}
