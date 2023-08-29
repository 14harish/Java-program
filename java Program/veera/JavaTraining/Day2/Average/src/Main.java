import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        int sum=0;
        for(int i=0;i<len;i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Average is: "+(sum/len));
    }
}