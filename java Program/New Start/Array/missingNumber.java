public class missingNumber {
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        int n=nums.length;
        int sum=(n*(n+1))/2;
        System.out.println(sum);
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        System.out.println(sum);
    }
}
