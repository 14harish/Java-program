package MaventicPratice;
import java.util.Scanner;
public class UniqueElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in );
        String str=sc.nextLine();
        int freq=0;
        for(int i=0;i<str.length();i++){
            boolean flag=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) flag=true;
            }
            String temp="";
            temp+=str.charAt(i);
            if(flag){
                freq++;
                str=str.replaceAll(temp,"");
                i--;
            }
        }
        freq+=str.length();
        System.out.println(freq);
    }
}
