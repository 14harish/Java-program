package Trainig.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    
}
