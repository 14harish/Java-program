import java.util.ArrayList;

public class diamond {
    public static void main(String[] args) {
        int n=6;
         ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s="";
            for(int j=0;j<i;j++){
                s+="*";
            }
            a.add(s);
        }
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        for(int i=a.size()-2;i>0;i--){
            System.out.println(a.get(i));
        }
    }
}
