import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class premutationGeeks {
    public static void main(String[] args) {
        String S="ABCD";
       List<String>ans=new ArrayList<>();
        find(0,S,ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
    public static void find(int index,String s,List<String>ans){
        if(index==s.length()){
              if(!ans.contains(s))
              ans.add(s);
              return;
        }
        for(int i=index;i<s.length();i++){
             s=swap(i,index,s);
            find(index+1,s,ans);
             s=swap(i,index,s);
        }
  }
 public static String swap(int i,int j,String s) {
        char [] ch=s.toCharArray();
         char c=ch[i];
         ch[i]=ch[j];
         ch[j]=c;
         return String.valueOf(ch);

 }
}
