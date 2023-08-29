package PascalTriangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int one=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=(num)-i;j++)
                System.out.print(" ");
            int temp=1;
            for(int k=1;k<=i;k++){
                System.out.print(temp+" ");
                temp=temp*(i-k)/k;
            }
            System.out.println();
        }
    }
}
