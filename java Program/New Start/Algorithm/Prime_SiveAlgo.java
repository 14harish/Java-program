import java.util.ArrayList;

public class Prime_SiveAlgo {
    public static void main(String[] args) {
        int n=35;
         boolean arr[]=new boolean[n+1];
        ArrayList<Integer> a=new ArrayList<>();
        // System.out.println(Arrays.toString(arr));
        for(int i=2;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==true){
                a.add(i);
            }
        }
        System.out.println(a);
    }
}
