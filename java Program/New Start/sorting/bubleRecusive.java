import java.util.Arrays;

public class bubleRecusive {
    public static int[] buble(int arr[],int i,int s){
        if(i==s-2){
            return arr;
        }else{
            for(int j=i+1;j<s;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            return buble(arr,i+1,s);
        }
    }
    public static void main(String[] args) {
        int size=5;
        int arr[]={8,9,3,1,7};
        arr=buble(arr, 0, size);
        System.out.println(Arrays.toString(arr));

    }
}
