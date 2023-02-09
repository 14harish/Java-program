public class recursionExample {
    public static void main(String[] args) {
        // System.out.println(print1(1));
        // System.out.println();
        print1(1);
    }
    public static void print1(int n){
        if(n==5){
            return;
        }
      System.out.println(n);
      print1(n+1);
      print1(n+1);
    }
}
