import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        int max=0;
        for(int i=0;i<=in.length()-3;i++){
            String temp=in.substring(i,i+3);
            int odd=Integer.parseInt(temp);
            if(odd%2!=0 && odd>=max) max=odd;
//            System.out.println(temp);
        }
        System.out.println(max);
    }
}