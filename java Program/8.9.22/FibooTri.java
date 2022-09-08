public class FibooTri {
    public static void main(String[] args) {
        int a=-1,b=1,c=0;
        int n=5,v=0;
            for(int i=1;i<=n;i++){
                for(int j=0;j<=n-v;j++){
                    System.out.print(" ");
                }
                v++;
                for(int j=1;j<=i;j++){
                    c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    }
                    System.out.println();
                }               
            }
}
