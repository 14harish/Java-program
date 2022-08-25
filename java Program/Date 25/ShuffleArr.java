import java.util.Random;

public class ShuffleArr {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,3,9};
        int temp=0;
        Random random=new Random();
        int ran=random.nextInt(arr.length);
       // System.out.println(ran);
        for(int i=0;i<arr.length;i++){
            temp=arr[ran];
            arr[ran]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
