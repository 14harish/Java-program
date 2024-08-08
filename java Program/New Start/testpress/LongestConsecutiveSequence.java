import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int arr[]={3, 8, 5, 7, 6};
        Arrays.sort(arr);
        int max=0;
        int count=0;
        for(int i=1;i<arr.length;i++){
            // System.out.println(arr[i-1]+"----"+arr[i]+"---"+(arr[i]-arr[i-1])+"---"+count);
             if (arr[i] == arr[i - 1]) {
                // Skip duplicates
                continue;
            } else if (arr[i] - arr[i - 1] == 1) {
                count++;
            }else{
                // System.out.println(count);
                if(max<count){
                    max=count;
                }
                count=0;
            }
        }
        if(max<count){
            max=count;
        }
        System.out.println(max+1);
        // return max+1;
    }
}