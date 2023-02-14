package Trainig.pattern;

public class NoPattern {
    public static void main(String[] args) {
        int n=5;
        int val=1;
        for(int i=0;i<n;i++){
        for(int k=n;k>i;k--,System.out.println()){
            for(int j=0;j<=i*2;j++){
                    System.out.print(val+" ");
            }
        }
        val++;
        }

    }

}
