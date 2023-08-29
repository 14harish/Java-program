import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char ch1=sc.next().charAt(0);
        int temp=(int)ch,temp1=(int)ch1;
        for(int i=temp;i<=temp1;i++)
            System.out.print((char)i+" ");
    }
}