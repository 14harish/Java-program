package Trainig.Basic;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {
    public static void main(String[] args) {
        int n=25;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=1;i*i<=n;i++){ //Math.sqrt alternate i*i<n
            if(n%i==0){
                a1.add(i);
                a1.add(n/i);
            }
        }
        Collections.sort(a1);
        System.out.println(a1);
    }
}
