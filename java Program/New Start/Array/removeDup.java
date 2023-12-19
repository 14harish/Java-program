import java.util.ArrayList;
import java.util.HashMap;

public class removeDup {
    public static void main(String[] args) {

        //this method used for only sorted use hahset for other method
        int arr[] = {1,2,2,3,3,4,5};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int p = 0; p < i+1; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}
