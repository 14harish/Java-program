// package Basic;
import java.util.*;
public class duckNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        String w=n+"";
        if(w.contains("0")){
            System.out.println("Duck Number");
        }else{
            System.out.println("Not Duck Number");
        }
        
    }
}
