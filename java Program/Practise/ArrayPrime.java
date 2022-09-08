package Practise;
import java.util.*;

public class ArrayPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        System.out.println("Enter the Numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prime Numbers:");
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=2;j<arr[i]/2;j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==1){
                if(arr[i]!=0 && arr[i]!=1){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
