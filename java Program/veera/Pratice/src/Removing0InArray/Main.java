package Removing0InArray;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        int count=0;
        for(int i=0;i<len;i++)
            if(arr[i]==0){
                count++;
                for(int j=i+1;j<len;j++)
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
            }
        System.out.println(Arrays.toString(arr));
    }
}
