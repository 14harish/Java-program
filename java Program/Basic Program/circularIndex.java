package Basic;
public class circularIndex {
    public static void main(String[] args) {
        String n="harishZ";
        char[] n2=new char[n.length()];
        StringBuffer sc=new StringBuffer();
        int s=0;
        for(int i=0;i<n.length();i++){
             s=n.charAt(i)+1;
             if(s==123){
                 s=97;
             }
             if(s==91){
                 s=65;
             }
             n2[i]=(char) (s);
             System.out.print(n2[i]);
        }
    }
}
