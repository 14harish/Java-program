import java.sql.Array;
import java.util.Arrays;

public class halfSort {
    public static void main(String[] args) {
        int arr[]={1,7,4,23,65,2,12,45,18,35};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
             for(int k=arr.length/2;k<arr.length;k++)
                if(i>arr.length/2){
                    if(arr[i]>arr[k]){
                        arr[i]=arr[i]+arr[k];
                        arr[k]=arr[i]-arr[k];
                        arr[i]=arr[i]-arr[k];
                    }
                }
            }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

