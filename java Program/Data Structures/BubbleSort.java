public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,22,33,4,55,6,88,77,7}; 
        arr=BubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] BubbleSort(int arr[]){
        int temp=0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j=-1; //After swaping starting from first
            }
        }
        return arr;
    }
}
