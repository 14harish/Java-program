
public class Character_Swapping {
    public static void main(String[] args) {
        String in="tody is is today present";
        String str[]=in.split(" ");
        StringBuffer s=new StringBuffer();
        StringBuffer sc=new StringBuffer();
            for(int i=0;i<str.length-1;i=i+2){
               if(str[i].length()>str[i+1].length()){
                sc.append(str[i+1]+" ");
                s.append(str[i].substring(str[i+1].length(),str[i].length())).reverse();
                sc.append(s);
                s.delete(0, s.length());
                sc.append(str[i].substring(0,str[i+1].length())+" ");
               }else{
                s.delete(0, s.length());
                s.append(str[i+1].substring(str[i].length(),str[i+1].length())).reverse();
                sc.append(s);
                s.delete(0, s.length());
                sc.append(str[i+1].substring(0,str[i].length())+" ");
                sc.append(str[i]+" ");
               }
            }
            
            s.append(str[str.length-1]).reverse();
            sc.append(s);
    
        System.out.println(sc);
    }    

}
