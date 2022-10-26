public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={19,2,33,4,56,5};
        int temp=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    j=-1;
                }
            }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
