import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to Printed: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            char ch='A';
            for(int j=1;j<=num;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}