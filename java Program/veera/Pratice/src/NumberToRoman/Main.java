package NumberToRoman;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[]base={ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[]roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String result="";
        for(int i=0;i<base.length;i++){
            while(num>=base[i]){
                result+=roman[i];
                num-=base[i];
            }
        }
        System.out.println(result);
    }
}
