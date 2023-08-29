import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        while(temp>9)
            temp=temp/10;
        if(temp%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}