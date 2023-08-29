import java.util.Scanner;
public class Main {
    static int gcd(int n1,int n2){
        if(n2==0) return n1;
        else return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(gcd(num1,num2));
        /*int gcd=1;    //normal method
        for(int i=1;i<num1 && i<num2;i++){
            if(num1%i==0 && num2%i==0) gcd=i;
        }
        System.out.print(gcd);*/
    }
}