
public class Add_char_front_ToPalidrom {
    public static void main(String[] args) {
        String in="AACECAAAA";
        int count=0;
        StringBuffer Norm=new StringBuffer(in);
        StringBuffer v=new StringBuffer(in);
        StringBuffer sc=new StringBuffer();
        for(int i=in.length()-1;i>=0;i--){
            sc.append(in.substring(i, in.length()));
            // v.append(in);
            v.reverse();
            // System.out.println(Norm+"---"+v);
            String s1=Norm.toString();
            String s2=v.toString();
            if(s1.equals(s2)){
                // System.out.println("hi");
                break;
            }else{
                count++;
                sc.reverse();
                v.reverse();
                v.delete(0, v.length());               
                v.append(sc);
                v.append(in);
                Norm.delete(0, Norm.length());               
                Norm.append(sc);
                Norm.append(in);
                sc.delete(0, sc.length());
            }
        }
        System.out.println(Norm+" "+v);
        System.out.println(count);
    }    
}
