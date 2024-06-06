
public class sort0s1s2s {
    public static void main(String[] args) {
        int arr[]={0,2,2,1,0};
        int n=arr.length;
        int low=0,high=n-1;
        for(int i=0;i<n && i<=high;){
            if(arr[i]==0){
                swap(arr,low,i);
                low++;
                i++;
            }
            else if(arr[i]==2){
                swap(arr,i,high);
                high--;
            }
            else{
                i++;
            }
        }
    }
    
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

