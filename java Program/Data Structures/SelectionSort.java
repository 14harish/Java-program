public class SelectionSort {
  public static void main(String[] args) {
      int arr[]={1,22,33,4,55,6,88,77,7};  
      arr=SelectionSort(arr);
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
}
public static int[] SelectionSort(int arr[]){
       int min=0;
    for(int i=0;i<arr.length;i++){
           min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    return arr;
}
}
