package Trainig.Basic;

public class strongNumber {
    public static void main(String[] args) {
        long fact[]=new long[21];
    fact[0]=1;
    for(int i=1;i<=20;i++){
        fact[i]=i*fact[i-1];
    }
    long n=123;
    long org=n,sum=0;
    do{
     sum+=fact[(int)n%10];
     n/=10;
    }
     while(n!=0);
     System.out.println(sum==org?"Right":"wrong");
    }
}
