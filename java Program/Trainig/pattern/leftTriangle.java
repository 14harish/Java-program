package Trainig.pattern;

public class leftTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++,System.out.println()){
            for(int s=1;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }

        System.out.println();
        for(int i=0;i<n;i++,System.out.println()){
            for(int s=1;s<=((n-i)*2)-2;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=(i*2);j++){
                System.out.print("*");
            }
        }
    }
}
