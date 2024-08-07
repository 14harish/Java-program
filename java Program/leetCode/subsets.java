import java.util.*;
public class subsets {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> a = new ArrayList<>();
        for(int i=(int)(Math.pow(2,nums.length)-1);i>=0;i--){
            List<Integer> f=new ArrayList<>();
            int temp=i;
            int index=nums.length-1;
            while(index>=0){
                if((temp&1)==1){
                    f.add(nums[index]);
                }
                temp>>=1;
                index--;
            }
            a.add(f);
        }
      System.out.println(a);
    }
}
