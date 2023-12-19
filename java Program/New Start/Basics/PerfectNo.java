
public class PerfectNo {
    public static void main(String[] args) {
        long sum=0;
        int N=6;
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                if(i==N/i){
                    if(i!=N){
                    sum+=i;
                    }
                }else{
                    if(i!=N){
                       sum+=i;
                    }
                   if(N/i!=N){
                   sum+=N/i;
                   }
                }
            }
        }
        if(sum==N){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    }

