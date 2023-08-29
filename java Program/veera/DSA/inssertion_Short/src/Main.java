public class Main {
    public static void main(String[] args) {
        int[] arr={1,5,4,78,96,3,2,14,};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(arr[j]>temp && (j>0||j==0)) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                temp=arr[j];
                j--;
            }
        }
        for(int i:arr) System.out.println(i);
    }
}