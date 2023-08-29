import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mul=sc.nextInt();
        int tim=sc.nextInt();
        int sum=0;
        for(int i=1;i<=tim;i++)
            sum+=mul;
        System.out.println(sum);
    }
}