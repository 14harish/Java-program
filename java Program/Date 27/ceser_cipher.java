public class ceser_cipher {
    public static void main(String[] args) {
        String in="Divkaran";
        String dup=in.toLowerCase();
        StringBuffer sc=new StringBuffer();
        char ch=0;
        int key=5,diff=0;
        for(int i=0;i<dup.length();i++){
            ch=(char)(dup.charAt(i)+key);
            if(ch >='z'){
                diff=ch-'z';
                ch=(char)('a'+diff-1);
            }
            if(Character.isUpperCase(in.charAt(i))){
                ch=Character.toUpperCase(ch);
            }
            sc.append(ch);
        }
        System.out.println(sc);
    }
}
