import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        String arr[]=in.split(" ");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            String rev="";
            for(int j=0;j<temp.length();j++){
                char chtemp=temp.charAt(j);
                rev=chtemp+rev;
            }
            System.out.print(rev+" ");
        }
    }
}