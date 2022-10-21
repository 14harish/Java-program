public class split_character_withN_dash {
    public static void main(String[] args) {
        String s="2-5g-3-J";
        s=s.replaceAll("-", "");
        int n=2,k=0;
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(k==n){
               System.out.print("-");
               k=0;
            }
            System.out.print(s.charAt(i));
            k++;
        }
    }
}
