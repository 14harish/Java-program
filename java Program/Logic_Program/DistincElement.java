import java.util.Arrays;

public class DistincElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3,1, 4, 8,5 };
        Arrays.sort(arr);
        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // count=0;
            // System.out.println(arr[i] + "--" + arr[i + 1]);
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 0) {
                    res = arr[i];
                    break;
                }
                count=0;
            }
            // System.out.println(count);
        }
        System.out.println(res+"---");
    }
}
