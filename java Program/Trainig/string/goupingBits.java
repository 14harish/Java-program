package Trainig.string;

import java.util.Scanner;

public class goupingBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bin=sc.nextLine();
        int r=bin.length()%3;
        if(r!=0)
        System.out.print(Integer.parseInt(bin.substring(0, r),2));

        for(int i=r;i<bin.length()-2;i+=3)
        System.out.print(Integer.parseInt(bin.substring(i,i+3),2));

    }
}
