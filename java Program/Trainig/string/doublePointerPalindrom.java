package Trainig.string;

public class doublePointerPalindrom {
    public static void main(String[] args) {
        String st="racecar";
        char ch[]=st.toCharArray();
        boolean pal=true;
        for(int i=0,j=st.length()-1;i<j;i++,j--){
            if(ch[i]!=ch[j]){
                pal=false;
            }
        }
        System.out.println(pal?"Yes":"No");
    }
}
