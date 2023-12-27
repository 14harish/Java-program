import java.util.Arrays;

public class fiboSeries {
    public static void main(String[] args) {
        int n=5;
        int arr[]=new int[n];
        if(n==1){
            arr[0]=0;
            System.out.println(Arrays.toString(arr));
        }
        arr[0]=0;
        arr[1]=1;
        arr=fibo(arr, 2, n);
        System.out.println(Arrays.toString(arr));
    }    
    public static int[] fibo(int arr[],int i,int n){
        if(i==n){
            return arr;
        }
        arr[i]=arr[i-1]+arr[i-2];
        return fibo(arr, i+1, n);
    }
}
