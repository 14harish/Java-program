import java.util.ArrayList;

public class numberPattern {
    public static void main(String[] args) {
        int n=12;
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s="",s1="";
           int dup=n;
            for(int j=0;j<n;j++){
                if(i>=j){
                    s+=dup+" ";
                    if(i!=j && j!=n-1){
                        s1=dup+" "+s1+" ";
                    }
                    dup-=1;
                }else{
                    s+=dup+1+" ";
                    s1=dup+1+" "+s1+" ";
                }
            }
            a.add(s+s1);
        }
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        for(int i=a.size()-2;i>=0;i--){
            System.out.println(a.get(i));
        }
    }
}
