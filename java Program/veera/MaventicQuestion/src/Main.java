import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pass=sc.nextLine();
        int length=pass.length();
        if(length>8 && length<10);
        else{
            System.out.println("Invalid");
            return;
        }
        int num=0,upper=0,spl=0;
        for(int i=0;i<pass.length();i++) {
            char temp = pass.charAt(i);
            if (temp >= '0' && temp <= '9') num++;
            else if(temp>='A' && temp<='Y') upper++;
            else if((temp>='0'&&temp<='9')||(temp>='a'&&temp<='y')||(temp>='A'&&temp<='Y'));
            else spl++;
        }
        if(num==0 || upper==0 || spl>0){
            System.out.println("Invalid");
            return;
        }
        else System.out.println("valid");
    }
}