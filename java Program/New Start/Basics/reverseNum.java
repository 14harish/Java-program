

public class reverseNum {
    public static void main(String[] args) {
        int n=9201;
        int rev=0;
        while(n!=0){
            int d=n%10;
            System.out.println(d+"-");
            rev+=d;
            System.out.println(rev);
            rev=rev*10;
            System.out.println(rev+"--");
            n/=10;
        }
        System.out.println();
    }
}
