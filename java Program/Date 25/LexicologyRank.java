import java.util.*;

public class LexicologyRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        char[] s=sc.nextLine().toCharArray();
        String m=new String(s);
        HashSet<String> h=new HashSet<>();
        while(true){
            h.add(shuffle(s));
            if(h.size()==fact(s.length)){
                break;
            }
        }
        ArrayList<String> aa=new ArrayList<>(h);
        Collections.sort(aa);
        for(int i=0;i<aa.size();i++){
            if(m.equals(aa.get(i))){
                System.out.println(i+1);
            }
        }
    }
    //permutation
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
