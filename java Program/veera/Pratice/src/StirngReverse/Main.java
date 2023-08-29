/*Input:ve*era
Output:ar*eev Reverse only the alphabet Charachter*/
package StirngReverse;
import java.util.*;
class Main{
    static boolean valid(char ch){
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="ve*era";//sc.nextLine();
        String rev="",result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(valid(ch)) rev=ch+rev;
        }
        int index=0;
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i),temp1=rev.charAt(index);
            if(valid(temp)){
                result+=temp1;
                index++;
            }
            else result+=temp;
        }
        System.out.println(result);
    }
}