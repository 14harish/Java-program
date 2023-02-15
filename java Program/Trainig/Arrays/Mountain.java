package Trainig.Arrays;


public class Mountain {
    public static void main(String[] args) {
        int arr[]={14,15,16,10,11,13};
        if(arr[0]>arr[1]){
            System.out.println(arr[0]);
            return;
        }
        else if(arr[arr.length-2]<arr[arr.length-1]){
            System.out.println(arr[arr.length-1]);
            return;
        }else{
            for(int i=0;i<arr.length-1;i++){
                if(arr[i-1]< arr[i] && arr[i]>arr[i+1]){
                    System.out.println(arr[i]);
                    return;
                }
            }
    }
    // 10,15,11,16,14
    // 14,15,16,9,13,19
}
}