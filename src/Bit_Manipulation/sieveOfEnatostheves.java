package Bit_Manipulation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class sieveOfEnatostheves {
    //Given a number N,print all primes till N.
    //Brute Approach...............

  //  for(i=2->N){
  //  if(prime(i){
  //  print(i);

    //Optimal Approach.................
    public static List<Integer>prime(int n){
        boolean[] isPrime=new boolean[n+1];
        for (int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        for (int i=2;i*i<=n;i++){
            if (isPrime[i]){
                for (int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        List<Integer>primes=new ArrayList<>();
        for (int i=2;i<=n;i++){
            if (isPrime[i]){
                primes.add(i);
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        int n = 50;
        List<Integer> primes = prime(n);
        System.out.println("Prime numbers up to " + n + " are: " + primes);
    }
}
