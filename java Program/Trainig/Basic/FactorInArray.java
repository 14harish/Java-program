package Trainig.Basic;

public class FactorInArray {
    public static void main(String[] args) {
        int n=10;
        long rem[] =new long[10000];
        int size=0;
        for(int i=0;i*i<n;i++){
            if(n%i==0){
                System.out.println(i+" ");
                rem[size++]=n/i;
            }
        }
    }
}
