import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int size=6;
        int arr[]={4,7,3,1,5,7};
        for(int i=1;i<size;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
