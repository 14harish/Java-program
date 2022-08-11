package Date11;

public class complex {
    public static void main(String[] args) {
        String n1="2.3+4.6i";
        String n2="1.2+2.1i";
        split(n1);
    }
    static void split(String n){
        n=n.replace('i', '\0');
        System.out.println(n);
        // for(int i=0;i<str.length;i++){
        //     System.out.println(str[i]);
        // }
      //  StringBuffer sc=new StringBuffer(n);
    }
}
