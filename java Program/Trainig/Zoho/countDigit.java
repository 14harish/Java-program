package Trainig.Zoho;

public class countDigit {
    public static void main(String[] args) {
        String s="d2f4c6";
        StringBuffer sc=new StringBuffer();
        for(int i=0;i<s.length();i=i+2){
            char a=s.charAt(i);
            int v=s.charAt(i+1)-'0';
            for(int j=0;j<v;j++){
                sc.append(a);
            }
        }
        System.out.println(sc);
    }
}
