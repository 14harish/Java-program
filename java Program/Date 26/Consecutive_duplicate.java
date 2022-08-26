public class Consecutive_duplicate {
    public static void main(String[] args) {
        StringBuffer sc=new StringBuffer("amma");
        for(int i=0;i<sc.length()-1;i++){
            if(sc.charAt(i)==sc.charAt(i+1)){
               sc.replace(i,i+1, " ");
               sc.replace(i+1,i+2, " ");
            }
        }
        String s=new String(sc);
        s=s.replace(" ", "");
        System.out.println(s);
    }    
}
