// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.
public class jumpGame {
    public boolean canJump(int[] nums) {
        int i=0,max=0;    
        while(i<nums.length){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+nums[i]);
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        jumpGame obj = new jumpGame();
        System.out.println(obj.canJump(nums));
    }
}
