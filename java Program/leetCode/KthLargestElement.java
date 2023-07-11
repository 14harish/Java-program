package leetCode;

import java.util.ArrayList;

public class KthLargestElement {
    public static void main(String[] args) {
        int nums[]={3,2,3,1,2,4,5,5,6};
        int k=2;
ArrayList<Integer> a=new ArrayList<>();
        int max=0;
        for(int i=0;i<k;i++){
            max=0;
            int pk=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>max){
                    max=nums[j];
                    pk++;
                    // nums[j]=-1;
                    // break;
                }
            }
            nums[pk]=-1;
            a.add(max);
        }
        System.out.println(a);
        // return a.get(a.size()-1);
    }
}
