import java.util.*;
public class Consecutive_duplicate {
    public static void main(String[] args) {
        Scanner sb=new Scanner(System.in);
        System.out.println("Enter String:");
        StringBuffer sc=new StringBuffer(" "+sb.nextLine()+" ");
        for(int i=1;i<sc.length()-1;i++){
            if(sc.charAt(i-1)!=sc.charAt(i) && sc.charAt(i+1)!=sc.charAt(i)){
                System.out.print(sc.charAt(i));
            }
        }
    }    
}
