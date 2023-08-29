package ArmstrongUsingRecursion;
import java.util.Scanner;
public class Main {
    static int arm(int num,int temp){
        if(num==0) return temp;
        int res=(num%10);
        temp+=res*res*res;
        return arm(num/10,temp);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=arm(num,0);
        if(result==num) System.out.println(num+" is Armstrong");
        else System.out.println(num+" is not a parindrome");
    }
}
