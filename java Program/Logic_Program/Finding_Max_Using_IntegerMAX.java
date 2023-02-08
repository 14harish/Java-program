public class Finding_Max_Using_IntegerMAX {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
