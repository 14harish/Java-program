package Trainig.Basic;

import java.util.Arrays;

public class factorial {
   public static void main(String[] args) {
    long fact[]=new long[21];
    fact[0]=1;
    for(int i=1;i<=20;i++){
        fact[i]=i*fact[i-1];
    }
    System.out.println(Arrays.toString(fact));
    System.out.println(fact[5]);
   } 
}
