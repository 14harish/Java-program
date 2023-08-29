/*4512
        Four Thousand Five Hundred Twele */
package NumberInWords;
import java.util.Scanner;
public class Main {
    static void words(int dig,String str){
        int num=dig;
        String[] once={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twele","Thirteen",
                "Fourteen", "Fiveteen","Sixteen","Seventeen","Eighteen","Nightteen"};
        String[] twos={"","","Twenty","Thirty","Fourty","Fivety","Sixty","Seventy","Eighity","Nighty"};
        String result="";
        if(num>19)
            result=twos[num/10]+" "+once[num%10];
        else
            result=once[num];
        if(dig>0) System.out.print(result+" "+str+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println("ero");
            return;
        }
        words((num/100000000),"Hundred");
        words((num/10000000)%100,"Crore");
        words((num/100000)%100,"Lakh");
        words((num/1000)%100,"Thousand");
        words((num/100)%10,"Hundred");
        words((num%100),"");
    }
}
