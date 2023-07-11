package Trainig.Basic;

import java.util.Arrays;

public class rotateArray {
    // int n=5;
    public static void main(String args[]){
    int a[]={1,2,3,4,5};
    int k=5;
    // print()
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++){
        int d=i-k;
        if(d<0)
        d+=a.length;
        b[d]=a[i];
    }
    System.out.println(Arrays.toString(b));
}
}
