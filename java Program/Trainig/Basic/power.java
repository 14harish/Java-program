

public class power {
    public static long powerof(long b,long e){
        long p=1;
        while(e!=0){
            System.out.println(p+"--"+b+"---"+e+"--"+(e&1));

            if((e&1)==1){
                p=p*b;
            }
            e>>=1;
            b=b*b;
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(powerof(13,31));
    }
}
