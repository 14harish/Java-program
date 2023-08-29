/*possible longest SubArray without repeating elements
Input-"veeragokulraj"
OP-eragokul*/
package LongestSubArrayInStr;
import java.util.Scanner;
public class Main {
    static boolean repeation(String st){
        String str=st;
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                char temp=str.charAt(i),temp1=str.charAt(j);
                if(temp==temp1){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String max="";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++) {
//                boolean flag=true;
                String temp="";
                for (int k=i;k<=j;k++) {
                    char ch=str.charAt(k);
                    temp += ch;
                }
                boolean flag=repeation(temp);
                /*for (int longest=0;longest<temp.length();longest++) {
                    for (int long1=longest+1;long1<temp.length();long1++) {
                        char rep=temp.charAt(longest),rep1=temp.charAt(long1);
                        if (rep==rep1) {
                            flag=false;
                            break;
                        }
                    }
                    if(!flag)break;
                }*/
                if(flag&&(max.length()<temp.length())) max = temp;
            }
        }
        System.out.println(max);
    }
}