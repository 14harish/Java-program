package Trainig.Basic;

import java.math.BigInteger;

public class BinaryBitCount {
    public static void main(String[] args) {
        int n=50;
        System.out.println(BigInteger.valueOf(n).bitLength());
        System.out.println((int)(Math.log(n)/Math.log(2)+1));
    }
}
