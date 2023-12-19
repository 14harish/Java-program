
public class GCD {
    public static int great(int a,int b){
        if(b==0){
            return a;
        }
        return great(b,a%b);
    }
    
    public static void main(String[] args) {
        int n=14,m=24;
        System.out.println("GCD of "+n+" and "+m+ " is :"+great(n, m));
    }

}
