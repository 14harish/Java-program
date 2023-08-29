import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static boolean MailValidation(String str){
        String mail=str;
        Pattern p=Pattern.compile("^[a-z]+[a-zA-Z0-9+_.-]+@[a-z-.]+.[a-z]{2,3}$");
        Matcher m=p.matcher(mail);
        if(m.find())    return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Mails: ");
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=num;i++) {
            System.out.println("Enter No. of Mail "+i+": ");
            String email = sc.nextLine();
            if (MailValidation(email))   System.out.println("Valid Email");
            else System.out.println("Invalid Email");
        }
    }
}
