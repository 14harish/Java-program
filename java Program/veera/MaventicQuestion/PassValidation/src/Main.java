import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pass=sc.nextLine();
        //System.out.println(pass.length());
        if(pass.length()<8||pass.length()>10){
            System.out.println("Invalid Pssword");
            return;
        }
//        System.out.println("Valid Pssword");
        boolean flag=true;
        for(int i=0;i<pass.length();i++){
            boolean cap=true,small=true,num=true;
            char temp=pass.charAt(i);
            /*if(!(Character.isAlphabetic(temp))&&!(Character.isDigit(temp))){   //using method
                flag=false;
                break;
            }*/
            if(temp<'0'|| temp>'9')
                num=false;
            if(temp<'a'||temp>'y')
                small=false;
            if(temp<'A'||temp>'Y')
                cap=false;
            if(!num&&!small&&!cap){
                flag=false;
                break;
            }
        }
        if(!flag){
            System.out.println("Invalid");
            return;
        }
        boolean cap=false,num=false;
        for(int i=0;i<pass.length();i++){
            char temp=pass.charAt(i);
            if(temp>='A'&&temp<='Y') {
                cap = true;
                break;
            }
            if(temp>='1'&&temp<='9'){
                num=true;
                break;
            }
        }
        if(cap||num) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}