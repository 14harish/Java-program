public class substringPrgTerv {
    public static void main(String[] args) {
        String a="geeks";
        String b="bcd";
        for(int i=0;i<a.length();i++){
            for(int j=i;j<=a.length();j++){
                System.out.println(a.substring(i, j));
            }
        }   
     }
}
