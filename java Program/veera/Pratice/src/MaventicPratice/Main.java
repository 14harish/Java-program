package MaventicPratice;
import java.util.Scanner;
public class Main {
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int frequency=2;
        for(int i=0;i<name.length();i++){
            int count=1;
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j))
                    count++;
            }
            String temp="";
            temp+=name.charAt(i);
            if(count>2){
                name=name.replaceAll(temp,"");
                i--;
            }
            if(count==2) System.out.print(name.charAt(i)+" ");
        }
    }
}
