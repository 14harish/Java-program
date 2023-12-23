import java.util.Arrays;

public class FindTriple0Sum {
    public static void main(String[] args) {
        int arr[]={0, -1, 2, -3, 1};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    System.out.println("true");
                }else if(sum<0) j++;
                else k--;
            }
        }
        System.out.println("False");
    }
}
