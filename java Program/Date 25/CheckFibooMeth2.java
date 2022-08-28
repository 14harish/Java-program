import java.util.*;
public class CheckFibooMeth2 {
    public static void main(String[] args) {
        int n=5;
        double sqrt=Math.sqrt(5*(n*n)-4);
        String s=sqrt+"";
        String arr[]=s.split("[.]");
        System.out.println(arr[1].equals("0"));
    }
}
