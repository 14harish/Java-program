import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        String result="";
        for(int i=0;i<in.length();i++){
            char temp=in.charAt(i);
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                temp=(char)(temp-32);
            }
            result+=temp;
        }
        System.out.println(result);
        /*char ch='a';
        System.out.println((char)(ch-32));*/
    }
}