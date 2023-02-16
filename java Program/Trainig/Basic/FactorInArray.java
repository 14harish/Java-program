package Trainig.Basic;
import java.util.*;

public class FactorInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long rem[] =new long[10000];
        int size=0;
        while(t -->0){
            size=0;
            long n=sc.nextLong();
        for(long i=1;i*i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                rem[size++]=n/i;
            }
        }
        for(int j=0;j<size;j++){
            System.out.print(rem[size-1-j]+" ");
        }
        System.out.println();
    }
    }
}
