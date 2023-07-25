public class XNumberPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            // System.out.println("--"+i);
            for(int j=1;j<=n;j++){
                // System.out.print(j);
                if(i==j){
                    if(i<(n+1)/2){
                        System.out.print(n-i+1);
                    }else{
                        System.out.print(i);
                    }
                }
                else if(i+j==n+1){
                if(i<(n+1)/2){
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
