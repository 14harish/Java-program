import java.util.ArrayList;

public class permutation { 
    public static void main(String[] args) {
        String str="ABC";
        ArrayList<String> a=new ArrayList<>();
        int size=str.length()-1;
        StringBuffer e1=new StringBuffer(str);
        a.add(str);
        e1.reverse();
        a.add(e1.toString());
        for(int i=0;i<size;i++) {
            // System.out.println(b);
            String b=str.substring(1)+str.charAt(0);
            a.add(b);
            str=b;
            StringBuffer e=new StringBuffer(b);
            // StringBuffer e;
            e.reverse();
            a.add(e.toString());
      }
      System.out.println(a);
}
}
