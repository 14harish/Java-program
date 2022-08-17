package Date17;

public class WithoutLoop {
    public static void main(String[] args) {
       int n=10;
        loop(1);   
    }

static int loop(int n){
    if(n==10){
        System.out.println(n);
        return 0;
    }
   System.out.println(n);
        return loop(n+1);       
}
}
