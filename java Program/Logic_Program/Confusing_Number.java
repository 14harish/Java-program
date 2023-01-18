import java.util.*;
public class Confusing_Number{
    public static void main(String[] args) {
        int n=20;
        StringBuffer sc=new StringBuffer();
        for(int i=6;i<n;i++){
            StringBuffer a=new StringBuffer(i+"");
            StringBuffer rev=new StringBuffer(a.reverse());
            System.out.println(rev);
        }
    }
}