
public class spyNum {
    public static void main(String[] args) {
            int n=217;
            int sum=0,mul=1;
          //digit add  
          while(n!=0){
            int d=n%10;
            sum+=d;
            mul*=d;
            n=n/10;
        }
        // System.out.println(sum+"-"+mul);
        if(sum==mul){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}
