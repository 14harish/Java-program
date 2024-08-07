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

        for(int i=0;i<ar.length-1;i++){
                if(ar[i]>ar[i+1]){
                    int temp=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                    i=-1;
                }
            }
        System.out.println(Arrays.toString(ar));
    }
    
}
