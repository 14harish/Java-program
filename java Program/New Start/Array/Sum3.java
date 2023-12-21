import java.util.HashSet;

public class Sum3 {
    public static void main(String[] args) {
        int arr[]={2,3,45,6,6};
        int n=arr.length;
        int X=11;
    for(int i=0;i<n-1;i++){
      HashSet<Integer> a=new HashSet<>();
            int sum=X-arr[i];
        for(int j=i+1;j<n;j++){
            int diff=sum-arr[j];
            if(a.contains(diff)){
                System.out.println("true");
            }
            a.add(arr[j]);
        }
    }
    System.out.println("false");
    }
}
