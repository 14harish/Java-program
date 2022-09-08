public class pascal {
    public static void main(String[] args) {
        int n=3;
        int v=0;
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=v;j<n;j++){
                System.out.print(" ");
            }v++;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a=a*(i-j)/j;
            }
            System.out.println();
        }
    }
}
