import java.lang.reflect.Array;
import java.util.Arrays;

public class EvenOddpattern {
    public static void main(String[] args) {
        int arr[]={9, 8, 13, 2, 19, 14};
        int arr1[]=new int[arr.length];
        Arrays.sort(arr);
        int j=0;
        if(arr[0]%2==0){
            for(int i=0;i<arr.length;i++){
                for(;j<arr.length;j++){
                    if(i%2==0){
                        if(arr[j]%2==0){
                            arr1[i]=arr[j];
                        }    
                    }
                    else{
                        arr1[i]=0;
                        break;
                    }
                }
            }
        }
        else{

        }
        for(int i=0;i<arr1.length;i++){ 
            System.out.println(arr1[i]+"-"+arr[i]);
    }
}
}
