public class Print_Longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String str="geeksforgeek";
        int max=0,len=0;
        StringBuffer sc=new StringBuffer();
        StringBuffer fin=new StringBuffer();
        String s="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                
            }
            if(max<len){
                fin=sc;
                sc.delete(i, len);
            }
        }
        System.out.println(fin);
    }    
}
