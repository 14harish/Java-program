import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,5,3};
        int sum=0,sum1=0;
        for(int i=0;i<arr.length;i++){
         sum+=arr[i];   
        }
        sum=sum/2;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    sum1=arr[i]+arr[j]+arr[k];
                    if(sum1==sum){
                        System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]);
                    }
                }
            }
           // System.out.println(sum1);
        }
        System.out.println(sum1);
    }
}
