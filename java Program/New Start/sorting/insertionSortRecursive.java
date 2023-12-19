import java.util.Arrays;

public class insertionSortRecursive {
    public static int[] insert(int arr[],int n,int i){
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
            }else{
                break;
            }
        }
        if(i==n-1){
            return arr;
        }
        return insert(arr, n, i+1);
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]={4,6,2,1,3};
        arr=insert(arr, n, 1);
        System.out.println(Arrays.toString(arr));
    }    
}
