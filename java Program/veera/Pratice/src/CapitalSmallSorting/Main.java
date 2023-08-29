package CapitalSmallSorting;
import java.util.Scanner;
public class Main {
    static boolean cap(char ch){
        if(ch>='A'&&ch<='Z') return true;
        else return false;
    }
    static String sorted(String str){
        String result="";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            result+=arr[i];
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String cap="",sml="",result="";
        for(int i=0;i<str.length();i++){
            if(cap(str.charAt(i))) cap+=str.charAt(i);
            else sml+=str.charAt(i);
        }
        System.out.println(str);
        cap=sorted(cap);
        sml=sorted(sml);
        String con=cap+sml;
        char[] arr=con.toCharArray();
        for(int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                char temp1,temp2;
                if(cap(arr[i])) temp1=arr[i];
                else temp1=(char)(arr[i]-31);
                if(cap(arr[j])) temp2=arr[j];
                else temp2=(char)(arr[j]-31);

                if(temp1>=temp2){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            result+=arr[i];
        }
        System.out.println(result);
    }
}
