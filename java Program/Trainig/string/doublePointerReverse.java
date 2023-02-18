package Trainig.string;

import java.util.Scanner;

public class doublePointerReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch[]=sc.nextLine().toCharArray();
        for(int i=0,j=ch.length-1;i<j;i++,j--){
        while(!(ch[i]>=65 && ch[i]<=122))i++;
        while(!(ch[j]>=65 && ch[j]<=122))j--;
        
            ch[i]=(char) (ch[i]^ch[j]);  //Swapping XOR Method without using two variable
            ch[j]=(char) (ch[i]^ch[j]);
            ch[i]=(char) (ch[i]^ch[j]);
        }
        System.out.println(ch);
    }
}
