package Trainig.Basic;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n =10;
        int bin=0;
        int m=1;
        while(n!=0){
            bin=bin+(n&1)*m;
            m*=10;
            n>>=1;
        }
        System.out.println(bin);
    }
}
