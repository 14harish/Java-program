import java.util.stream.IntStream;

public class NearestPrime {
    static int neg=0,pos=0;
    public static void main(String[] args) {
        int n=10 ;
        // System.out.println(makePrime(n)+"--"+makePrimePos(n));
        int p=makePrime(n);
        int v= makePrimePos(n);
        // System.out.print(neg+"++"+pos+"--"+v+"---");
        int res=0;
        if(neg==pos){
            res=p;
        }else{
            if(neg<pos){
                res=p;
            }else{
                res=v;
            }
        }
        System.out.println(res);
    }
    static int makePrime(int n){
        // System.out.println(n);
        neg++;
        // int count=0;
        // for(int i=2;i<n/2;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        if(isPrime(n)){
            // System.out.println(n);
            return n;
        }
        else{
            return makePrime(n-1);
        }
    }
    static int makePrimePos(int n){
        // System.out.println(n+"---");
        pos++;
        // int count=0;
        // for(int i=2;i<n/2;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        if(isPrime(n)){
            // System.out.println(n);
            return n;
        }
        else{
            return makePrime(n+1);
        }
    }
    static boolean isPrime(int number) {
        if(number <= 2)
          return number == 2;
        else
          return  (number % 2) != 0
              &&
              IntStream.rangeClosed(3, (int) Math.sqrt(number))
              .filter(n -> n % 2 != 0)
                  .noneMatch(n -> (number % n == 0));
      }
    }
