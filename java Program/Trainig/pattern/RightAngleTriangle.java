package Trainig.pattern;

public class RightAngleTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }

        System.out.println();
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<=i*2;j++){
                System.out.print("*");
            }
        }
    }
}
