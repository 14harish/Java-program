package Trainig.Basic;

public class primeNumber {
    public static void main(String[] args) {
        int n=22;
        boolean f=true;
        if(n%2==0 && n!=2){ 
            f=false;
            System.out.println("No");
            return;
        };
        for(int i=3;i<Math.sqrt(n);i++){
            if(n%i==0){
                f=false;
                break;
            }
    }
    System.out.println(f ? "Yes" : "No");
    }
}
