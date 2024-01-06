import java.util.ArrayList;

public class firstandLastOccurence {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x=5;
        int n=arr.length;
            int[] result = { -1, -1 };  //we cant pass the value as variable it will be only reference it will affect the original value it only change in the recursive call so we are using array here
            search(arr, x, 0, n - 1, result);
            ArrayList<Integer> a = new ArrayList<>();
            a.add(result[0]);
            a.add(result[1]);
            System.out.println(a);
        }
    
        public static void search(int arr[], int x, int start, int end, int[] result) {
            if (start <= end) {
                int mid = start + (end - start) / 2;
                if (x == arr[mid]) {
                    if (result[0] == -1 || mid < result[0]) {
                        result[0] = mid;
                    }
                    if (mid > result[1]) {
                        result[1] = mid;
                    }
                    search(arr, x, start, mid - 1, result);
                    search(arr, x, mid + 1, end, result);
                } else if (x < arr[mid]) {
                    search(arr, x, start, mid - 1, result);
                } else {
                    search(arr, x, mid + 1, end, result);
                }
            }
        }
    }


