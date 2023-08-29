/*We need to find the 4 passward to the given mobileNumber
1st pass is should be even: it should start with 1st digit add the subsequent number untill it become even
2nd pass is should be odd: it should start with subsequent number of passWord one ended digit add the
3rd is odd
4th is evevn
 subsequent number un till it become odd
 Repert the process un till we get 4digit passWord*/
package PnoneNumPass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num="9880127431";
        String result="";
        int index=0,len=num.length(),sum=(int)(num.charAt(index)-'0');
        while(sum%2!=0){
            index++;
            if(index>len){
                System.out.println("NILL PASSCODE");
                return;
            }
            sum+=(int)(num.charAt(index)-'0');
        }
        index++;
        result+=sum+" ";
        sum=(int)(num.charAt(index)-'0');
        while(sum%2!=1){
            index++;
            if(index>=len){
                result+=sum;
                System.out.println(result);
                return;
            }
            sum+=(int)(num.charAt(index)-'0');
        }
        index++;
        result+=sum+" ";
        sum=(int)(num.charAt(index)-'0');
        while(sum%2!=1){
            index++;
            if(index>=len){
                result+=sum;
                System.out.println(result);
                return;
            }
            sum+=(int)(num.charAt(index)-'0');
        }
        index++;
        result+=sum+" ";
        sum=(int)(num.charAt(index)-'0');
        while(sum%2!=0){
            index++;
            if(index>=len){
                result+=sum;
                System.out.println(result);
                return;
            }
            sum+=(int)(num.charAt(index)-'0');
        }
        System.out.println(result);
    }
}
