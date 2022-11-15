package leetCode;
import java.math.BigInteger;

//In this concept of BigInteger 
//Big Integer stores out range int value for acessing the big Number to proces 
//bigNumber also used for the math operation to perform like checking the prime Number also

public class PlusoneToArr {
    public static void main(String[] args) {
        int arr[]={2,3,4,4};
        int plus[]=plusOne(arr);
        System.out.print("[");
        for(int i=0;i<plus.length;i++){
            System.out.print(plus[i]+" ");
        }
        System.out.print("]");
    }
public static int[] plusOne(int[] digits) {
    StringBuffer sc=new StringBuffer();
    for(int i=0;i<digits.length;i++){
        sc.append(digits[i]);
    }
    String s=sc.toString();
    // long sum = Long.parseLong(s)+1;
    BigInteger b=new BigInteger(s);
    BigInteger Num=new BigInteger("1");
    BigInteger r=b.add(Num);
    String v=r.toString();
    // System.out.println(v);
    char a[]=v.toCharArray();
    int arr[]=new int[a.length];
    for(int i=0;i<a.length;i++){
        arr[i]=a[i]-'0';
    }
    System.out.println(v);
    return arr;
}
}
