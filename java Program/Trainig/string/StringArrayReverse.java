package Trainig.string;

import java.rmi.server.Operation;

public class StringArrayReverse {
    public static void main(String[] args) {
        String str="ONE TWO THREE";
        String arr[]=str.split(" ");
        String b="";
        for(int i=arr.length-1;i>=0;i--){
            // System.out.print(arr[i]+" ");
            b+=arr[i]+" ";
        }
        // System.out.println(b.trim());
        String c="";
        for(int i=str.length()-1;i>=0;i--){
            // System.out.print(str.charAt(i));
            if(str.charAt(i)==' ' || i==0){
                if(i==0){
                    c+=str.charAt(i);
                }
                for(int j=c.length()-1;j>=0;j--){
                    System.out.print(c.charAt(j));
                }
                System.out.print(" ");
                c="";
            }else{
                c+=str.charAt(i);
            }
        }
        System.out.println();
        for(int i=str.length()-1;i>=0;i--){
            // System.out.print(str.charAt(i));
            if(str.charAt(i)==' ' || i==0){
                if(i==0){
                    c+=str.charAt(i);
                }
                for(int j=0;j<c.length();j++){
                    System.out.print(c.charAt(j));
                }
                System.out.print(" ");
                c="";
            }else{
                c+=str.charAt(i);
            }
        }
        System.out.println(c);
    }
}
