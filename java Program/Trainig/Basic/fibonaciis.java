package Trainig.Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class fibonaciis {
    public static void main(String[] args) {
        int n=10;
        int fib[]=new int[n+1];
        fib[0]=0;fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
        //fib of Triangle
        int fibTri[]=new int[n+1];
        fibTri[0]=1;fibTri[1]=1;
        for(int i=2;i<=n;i++){
            fibTri[i]=fibTri[i-1]+fibTri[i-2];
        }
        System.out.println(Arrays.toString(fibTri));
        
    }
}
