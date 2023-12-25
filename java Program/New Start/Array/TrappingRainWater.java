public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={0,1,2,1,0,1,3,2,1,2,1};
        int n=arr.length;
        int i=0,j=n-1,leftMax=0,rightMax=0;
        long res=0;
        while(i<j){
            if(arr[i]<=arr[j]){
                if(arr[i]>=leftMax){
                    leftMax=arr[i];
                }else{
                    res+=leftMax-arr[i];
                }
                i++;
            }else{
                if(arr[j]>=rightMax){
                    rightMax=arr[j];
                }else{
                    res+=rightMax-arr[j];
                }
                j--;
            }
        }
        System.out.println(res);
    }
}
