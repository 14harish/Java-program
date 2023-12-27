
public class factorial {
    public static void main(String[] args) {
        int N=5;
        long n=fact(N);
        System.out.println(n);
    }
    public static long fact(int N){
        if(N==0) return 1;
        else return N*fact(N-1);
    }
}
