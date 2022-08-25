import java.util.*;
public class LexicologyRank {
    public static void main(String[] args) {
        char[] s={'a','b','c'};
        HashSet<String> h=new HashSet<>();
        while(true){
            h.add(shuffle(s));
            if(h.size()==fact(s.length)){
                break;
            }
        }
        ArrayList<String> aa=new ArrayList<>(h);
        Collections.sort(aa);
        String in=new String(s);
        aa.indexOf(s);
        for(String e:aa){
            System.out.println(e);
        }
    }
    static String shuffle(char se[]){
        Random rn=new Random();
        int s=rn.nextInt(se.length);
        int e=rn.nextInt(se.length);
        char temp=0;
        temp=se[s];
        se[s]=se[e];
        se[e]=temp;
        String str=new String(se);
        return str;
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }
}
