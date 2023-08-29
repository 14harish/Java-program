import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==temp) {
                    System.out.print("*");
                    temp--;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}