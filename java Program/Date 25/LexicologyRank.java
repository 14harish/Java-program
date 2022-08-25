import java.util.*;
public class LexicologyRank {
    public static void main(String[] args) {
        char[] s={'a','b','c'};
        HashSet<String> h=new HashSet<>();
        while(true){
            h.add(shuffle(s));
            if(h.size()==6){
                break;
            }
        }
        for(String e:h){
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
        se[s]=temp;
        String str=new String(se);
        return str;
    }
}
