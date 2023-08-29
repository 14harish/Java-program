package ArrayRotation;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int rot=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        for(int k=1;k<=rot;k++) {
            int temp=arr[len-1];
            for (int i=len-1;i>0;i--){
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
