package Trainig.Basic;

import java.util.Arrays;

public class deArrangementORSubFactorial {
    public static void main(String[] args) {
        int n=4;
        int f[]=new int[n];
        f[0]=0;f[1]=1;
        for(int i=2;i<n;i++){
            f[i]=i*(f[i-1]+f[i-2]);
        }
        System.out.println(Arrays.toString(f));
        System.out.println(f[n-1]);
    }
}
