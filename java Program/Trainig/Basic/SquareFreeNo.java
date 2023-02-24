package Trainig.Basic;

public class SquareFreeNo {
    public static void main(String[] args) {
        int n=32;
        System.out.println(isSqurfree(n));
    }

    private static boolean isSquare(int n) {
        int squr=(int)Math.sqrt(n);
        return squr*squr==n?true:false;
    }
    private static boolean isSqurfree(int n) {
        for(int i=2;i*i<n;i++){
            if(n%i==0 && isSquare(i)){
                return false;
            }
        }
        return true;
    }
}
