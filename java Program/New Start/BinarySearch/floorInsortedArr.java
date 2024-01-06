
public class floorInsortedArr {
    public static void main(String[] args) {
        long arr[]={1,2,8,10,11,12,19};
        int x=5;
        int n=arr.length;
        int result=-1;
        int n1= search(arr,x,0,n-1,result);
        System.out.println(n1);
    }    
    public static int search(long arr[],long x,int start,int end,int res){
        if (start <= end) {
          int mid = start + (end - start) / 2;

          if (arr[mid] <= x) {
              res = mid;
              return search(arr, x, mid + 1, end, res);
          } else {
              return search(arr, x, start, mid - 1, res);
          }
      }

      return res;
  }
}
