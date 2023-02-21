package Trainig.Basic;

public class AddingTwoString {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("99");
        StringBuffer s1=new StringBuffer("9999");
        s.reverse();s1.reverse();
        
        String res="";
        System.out.println(s+"\n"+s1);
        
        int min=s.length()>s1.length()?s1.length():s.length();
        StringBuffer check=s.length()>s1.length()?s:s1;
        
        int carry=0;
        int n=0;
        for(int i=0;i<min;i++){
            int v1=Integer.valueOf(s.charAt(i)+"");
            int v2=Integer.valueOf(s1.charAt(i)+"");
            n=v1+v2+carry;
            carry=n/10;
            res=n%10+""+res;
        }

        for(int i=min;i<check.length();i++){
            int val=Integer.valueOf(check.charAt(i)+"")+carry;
            carry=val/10;
            res=val%10+res;
        }
        res=(carry==0)?"":carry+res;
        // System.out.println(carry);
        System.out.println(res);
    }
}
