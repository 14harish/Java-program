public class Main {
    public static void main(String[] args) {
        int arr[]={2,78,6,4,5,7,1};
        for(int i=0;i<arr.length;i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                while (min > arr[j]) {
                    min=arr[j];
                    arr[j] = arr[i];
                    arr[i]=min;

                }
            }
        }
        for(int i:arr)  System.out.println(i);
    }
}