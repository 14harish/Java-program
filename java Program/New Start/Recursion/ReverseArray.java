import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int n=nums.length;
        nums=reverse(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] reverse(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }else{
            return arr;
        }
        return reverse(arr, start+1, end-1);
    }
}
