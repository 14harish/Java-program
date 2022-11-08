package recursion;
public class recursionFibo {
    static int n1=0,n2=1,n3=0;    
    public static void main(String[] args) {
        System.out.print(n1+" "+n2);
        int n=10;
        fibo(n-2);
    }
    public static int fibo(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            return fibo(count-1); //It decreasing the count
        }else{
            return 0;
        }
    }
}
