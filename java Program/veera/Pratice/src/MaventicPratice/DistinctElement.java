package MaventicPratice;
import java.util.Scanner;
public class DistinctElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==1) System.out.print(arr[i]+" ");
        }
    }
}
