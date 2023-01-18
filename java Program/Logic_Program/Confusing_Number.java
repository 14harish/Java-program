import java.util.*;
public class Confusing_Number{
    public static void main(String[] args) {
        int n=100;
        int count=0;
        
        StringBuffer sc=new StringBuffer();
        for(int i=6;i<=n;i++){
            String b=i+"";
            if((check(b))){
              sc.append(b+" ");
              count++;
           }
        }
        System.out.println(sc);
        System.out.println(count);
    }
    public static boolean check(String a){
        String key="23457";
        StringBuffer sc=new StringBuffer(a);
         int count=0;
        for(int i=0;i<a.length();i++){
            if(sc.charAt(i)=='6'){
                sc.replace(i, i+1, "9");
            }else if(sc.charAt(i)=='9'){
                sc.replace(i,i+1,"6");
            }
            if(key.contains(a.charAt(i)+"")){
                return false;
            }
        }
        String o=sc.toString();
        String b=sc.reverse().toString();
        System.out.println(a+"---"+b);
        if((!b.equals(a))){
            return true;
        }else{
            return false;
        }
    }
}