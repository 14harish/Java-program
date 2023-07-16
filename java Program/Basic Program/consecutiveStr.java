public class consecutiveStr{
    public static void main(String[] args) {
        String n="abbcccddddeeeeedcba";
        char[] s=n.toCharArray();
        int count=0,x=0;
        char d=0;
        for(int i=0;i<s.length-1;i++){
            if(s[i]==s[i+1]){
               count++;
            }
            else{
                count=1;
            }
            if(x<count){
                x=count;
                d=s[i];
            }
        }
        System.out.println(x+"-"+d);        
    }
}