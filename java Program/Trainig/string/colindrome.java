package Trainig.string;

public class colindrome {
    public static void main(String[] args) {
        String s="collocmappam";
        boolean f=true;
        if(s.length()%6!=0){
            System.out.println("Not colindrome");
        }
        for(int i=0;i<s.length();i=i+6){
            if(!(palidrome(s.substring(i, i+6)))){
                System.out.println("Not colindrome");
                f=false;
                break;
            }
        }    
        if(f){
            System.out.println("colindrome");
        }    
    }
    static boolean palidrome(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }   
}
