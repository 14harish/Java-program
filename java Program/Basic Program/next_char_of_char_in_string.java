package Basic;
public class next_char_of_char_in_string {
    public static void main(String[] args) {
        String n="computer";
        StringBuffer sc=new StringBuffer();
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='z'){
                sc.append('a');
            }
            else if(n.charAt(i)=='Z'){
                sc.append('A');
            }
            else{
                sc.append((char)(n.charAt(i)+1));
            }
        }
        System.out.println(n+":"+sc);
    }
}
