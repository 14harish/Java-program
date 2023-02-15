package Trainig.Arrays;

import java.util.Scanner;

public class sumElementInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
        int sum=0;
        int mul=1;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            mul*=ar[i];
        }
        System.out.println("sum:"+sum);
        System.out.println("Multi:"+mul);
    }
}
