// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        if(power==0){
            System.out.println("1");
            return;
        }
        int result=1;
        for(int i=1;i<=power;i++)
            result=result*base;
        System.out.println(result);
    }
}