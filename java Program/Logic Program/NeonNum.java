

public class NeonNum {
    public static void main(String[] args) {
        int n=3;
        int e=n*n;
        int sum=0;
        while(e!=0){
            int d=e%10;
            sum+=d;
            e=e/10;
        }
        if(n==sum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
