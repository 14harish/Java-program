
public class Checking {
    public static void main(String[] args) {
        int n=1001;
        System.out.println(n);
        String s=""+n;
        s=s.replace("1","");
        s=s.replace("0","");
        if(s.length()==0){
            System.out.println("True");
        }
        else{
            System.out.println("Flase");
        }
    }
}
