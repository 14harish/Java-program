public class KandansALgo {
    public static void main(String[] args) {

        // Given an array Arr[] of N integers. 
        // Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum

        
        int arr[]={1,2,3,-2,5};
        int n=arr.length;
        long max=arr[0];
        long sum=0;
        for(int i=0;i<n;i++){
            if(sum<0) sum=0;
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
