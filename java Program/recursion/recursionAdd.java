package recursion;
public class recursionAdd{
    public static void main(String[] args) {
        int n=5;
        int add=Add(n);
        System.out.println(add);  
    }
    public static int Add(int n){
        if(n>0){
            return n+Add(n-1);
        }else{
            return 0;
        }
    }
}