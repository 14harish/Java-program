/*Input was a 3 Bike Number without any spaces if the 4Didit of the 1st bike was a Luckey number
(Add the digits untill it comes to an single digit if the num was 5 or 7 it is luckey number)
and print the 1st bike number or else check the other 2 numbers if there is no Luckey number
print nill*/
package BikeNumber;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        String arr[]=new String[3];
        int index=0;
        for(int i=0;i<=num.length()-4;) {
            boolean flag = true;
            String temp = num.substring(i, i + 4);
            for (int j=0; j<temp.length();j++) {
                char tmp=temp.charAt(j);
                if (tmp<'0'||tmp > '9') {
                    flag = false;
                    break;
                }
            }
            if(flag){
                temp=num.substring(0,i+4);
                arr[index]=temp;
                num=num.substring(i+4);
                index++;
                i=0;
            }
            i++;
        }
        boolean flag=false;
        int[]Inarr=new int[3];
        for(int i=0;i<3;i++){
            String temp=arr[i];
            temp=temp.substring((temp.length()-4));
            Inarr[i]=Integer.parseInt(temp);
            int result=Inarr[i];
            int out=0;
            if(result%9!=0) out=result%9;
            if(out==5||out==7){
                System.out.println(arr[i]);
                return;
            }
        }
        if(!flag) System.out.println("NILL");
//        TN30CB4365HJ8K5479KJ9L0987
    }
}
