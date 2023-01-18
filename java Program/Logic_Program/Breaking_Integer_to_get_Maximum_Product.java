import java.math.BigInteger;
import java.util.ArrayList;

public class Breaking_Integer_to_get_Maximum_Product {
    public static void main(String[] args) {
        int n=10;
        String str="";
        for(int i=0;i<n;i++){
            str+='9'+"";
        }
        BigInteger num = new BigInteger(str);
        // System.out.println(num);
        BigInteger bigInt1=new BigInteger("0");
        ArrayList<BigInteger> a=new ArrayList<>();
        for(BigInteger bigInt = bigInt1; bigInt.compareTo(num)<0; bigInt = bigInt.add(BigInteger.ONE)){
            // System.out.println(bigInt);
            a.add(bigInt);
        }
        System.out.println(a);
    }    
}
