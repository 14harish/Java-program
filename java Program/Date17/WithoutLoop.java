package Date17;

public class WithoutLoop {
    public static void main(String[] args) {
       int t=100;
        loop(1,t);   
    }

static int loop(int n,int t){
    if(n==t){
        System.out.println(n);
        return 0;
    }
   System.out.println(n);
        return loop(n+1,t);       
}
}
