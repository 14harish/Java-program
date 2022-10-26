package metta;

public class Match_substring_with_given_str {
    public static void main(String[] args) {
        String str="fi_er";
       // StringBuffer sc=new StringBuffer();
        String str1="filer:filter:fixer:tailor:offers";
        String sp1[]=str.split("_");
        String sp2[]=str1.split(":");
        int index=str.indexOf("_");
        for(int i=0;i<sp2.length;i++){
            if(sp1[0].equals(sp2[i].substring(0,index)) && sp1[1].equals(sp2[i].substring(index+1, sp2[i].length()))){
                System.out.println(sp2[i]);
            }
        }
    }
}
