import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,3,3};
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }else{
                h.put(nums[i],1);
            }
        }
        int maxVal=0,maxKey=0;
        for(Map.Entry<Integer,Integer> a:h.entrySet()){
            if(maxVal<a.getValue()){
                maxVal=a.getValue();
                maxKey=a.getKey();
            }
        }
        // System.out.println(h);
        // return maxKey;
        System.out.println(maxKey);
        // Annothet method python whithout using another memory
        // nums.sort()
        // count=1
        // n=0
        // if len(nums)<2:
        //     return nums[0]
        // max1=0
        // for i in range(len(nums)-1):
        //     print(nums[i],"==")
        //     if nums[i]==nums[i+1]:
        //         count+=1
        //     else:
        //         if count>max1:
        //             max1=count
        //             n=nums[i]
        //         count=0
        // if nums[-2]==nums[-1]:
        //     count+=1
        //     if count>len(nums)/2:
        //         n=nums[-1]
        // return n
    }
}
