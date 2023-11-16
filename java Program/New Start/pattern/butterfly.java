import java.util.ArrayList;

public class butterfly {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s2="",s1="";
            for(int j=0;j<n;j++){
                if(i>=j){
                    s2+="* ";
                    s1="* "+s1;
                }else{
                    s2+="  ";
                    s1="  "+s1;
                }
            }s.add(s2+s1);
        }   
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
        for(int i=s.size()-2;i>=0;i--){
            System.out.println(s.get(i));
        }
    }
}
