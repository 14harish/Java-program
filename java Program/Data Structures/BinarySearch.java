public class BinarySearch {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9};
       int key=4;
       int n=arr.length;
       System.out.println("Index:"+search(arr, key, 0, n-1));
    }
    static int binarysearch(int arr[], int n, int k) {
        return search(arr,k,0,n-1);
    }
    static int search(int arr[],int k,int l,int h){
        // int mid=0;
        if(l<=h){
            System.out.println(l+"---"+h);
            int mid=l+(h-l)/2;
            System.out.println(mid+"");
            if(k==arr[mid]){
                return mid;
            }
            else if(arr[mid]<k){
              return search(arr,k,mid+1,h);
            }
            else{
              return search(arr,k,l,mid-1);
            }
        }else{
           return -1;
       }    
   }
}
