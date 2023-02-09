import java.util.Scanner;

public class Matching_and_Non_Matching_character {
    public static void main(String[] args) {
       int option1=0;
       int option2=0;
       String str1="Hello";
       String str2="Welcome";
       StringBuffer non=new StringBuffer();
       StringBuffer match=new StringBuffer();
       for(int i=0;i<str1.length();i++){
        if(str2.contains(str1.charAt(i)+"")){
            match.append(str1.charAt(i));   
        }
        else{
            non.append(str1.charAt(i));   
        }
       }
       for(int i=0;i<str2.length();i++){
        if(str1.contains(str2.charAt(i)+"")){
            match.append(str2.charAt(i));   
        }
        else{
            non.append(str2.charAt(i));   
        }
        }
       if(option1==1){
          if(option2==1){
            System.out.println(non.toString().toUpperCase());
          }else{
            System.out.println(non.toString().toLowerCase());
          }
       }else{
          if(option2==1){
            System.out.println(match.toString().toUpperCase());
          }else{
            System.out.println(match.toString().toLowerCase());
          }
       }        
    }
}
