import java.util.ArrayList;

public class center {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s="",s1="";
            for(int j=0;j<n;j++){
                if(i>=j){
                    s+="* ";
                    s1="* "+s1;
                }else{
                    s+="  ";
                    s1="  "+s1;
                }
            }
            a.add(s+s1);
        }
        for(int i=a.size()-1;i>0;i--){
            System.out.println(a.get(i));
        }
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }    
    }
}
