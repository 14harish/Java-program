package metta;

public class Match_substring_with_given_str {
    public static void main(String[] args) {
        String str="fi_er";
        String temp="";
       // StringBuffer sc=new StringBuffer();
        String str1="filer:filter:fixer:tailor:offers";
        String sp1[]=str.split("_");
        String sp2[]=str1.split(":");
        System.out.println(sp1.length);
        int index=str.indexOf("_");
        if(str.charAt(str.length()-1)!='_'){
			sp1[1]=sp1[1].toLowerCase();
			temp=sp1[1];
		}    
        for(int i=0;i<sp2.length;i++){
            if(sp1[0].equals(sp2[i].substring(0,index)) && temp.equals(sp2[i].substring(index+1))){
                System.out.println(sp2[i]);
            }
        }
    }
}
