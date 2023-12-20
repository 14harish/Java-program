import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int arr[]={11,23,34,67};
        int x=89;
        int n=arr.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            int dif=x-arr[i];
            if(h.contains(dif)){
                System.out.println("True");
            }
            h.add(arr[i]);
        }
        System.out.println("False");
    }
}
