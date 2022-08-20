package Training;

public class Guess_Secret_Number {
    public static void main(String[] args) {
        String n="321",n2="4156";
        int r=0,p=0,u=0;
        StringBuffer s=new StringBuffer(n);
        StringBuffer s1=new StringBuffer(n2);
        s=add(s);
        s1=add(s1);
        // System.out.println(s);
        // System.out.println(s1);-
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++){
                if(i==j){
                   // System.out.println(s1.charAt(i)+"-"+s.charAt(i));
                    if(s.charAt(i)==s1.charAt(i)){
                        p++;
                        s.replace(i, i+1, " ");
                        s1.replace(i, i+1, " ");
                }
                }            
                }
            }
        for(int i=0;i<s.length();i++){
            
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)!=' '&& s.charAt(i)!=' ' &&s.charAt(i)==s1.charAt(j)){
                    //System.out.println(s.charAt(i)+"="+s1.charAt(j));
                    s.replace(i, i+1, " ");
                    s1.replace(j, j+1, " ");
                    r++;
                }
            }
        }
        System.out.println(p+"P"+r+"R");
        System.out.println();
        // System.out.println(s);
        // System.out.println(s1);
    }    
    static StringBuffer add(StringBuffer s){
        if(s.length()==3){
            s.insert(0, " ");
        }
        if(s.length()==2){
            s.insert(0, " ");
            s.insert(1, " ");
        }
        if(s.length()==1){
            s.insert(0, " ");
            s.insert(1, " ");
            s.insert(2, " ");
        }
        return s;
    }
}
