package recursion;
public class recusionFact {
    public static void main(String[] args) {
        int n=5,res=1;
        res=fact(n);
        System.out.println(res);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
