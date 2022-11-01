import java.util.ArrayList;

public class SubstringPrg {
    public static void main(String[] args) {
        String in="mania";
        char key='m';
        StringBuffer sc=new StringBuffer();
        ArrayList<String> s=new ArrayList<>();
        int len=0;
        for(int i=2;i<in.length();i++){
            int n=i;
             len=in.length()-(n-1);
            for(int j=0;j<len;j++){
                s.add(in.substring(j, n)+" ");
                // sc.append();
                n++;
            }
        }
        s.add(in);
        int count=0;
        for(int i=0;i<s.size();i++){
            if(s.get(i).contains(key+"")){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(s);
    }
}
