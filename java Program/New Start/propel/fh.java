import java.util.*;
public class fh {
public static void main(String[] args) {
        String a="45467903";
        System.out.println(strChallenge(a));
}
 static String strChallenge(String s){
    StringBuilder sb = new StringBuilder(s);
    for(int i=0; i<sb.length()-1; i++){
    if((sb.charAt(i)=='0')||(sb.charAt(i+1)=='0')){
        continue;
        }
    else if((sb.charAt(i)-'0')%2==0 && (sb.charAt(i+1)-'0')%2==0){
        sb.insert(i+1, "*");
        i++;
    }
    else if((sb.charAt(i)-'0')%2==1 && (sb.charAt(i+1)-'0')%2==1){
        sb.insert(i+1, "-");
        i++;
    }
 }
 return sb.toString();
 }

}