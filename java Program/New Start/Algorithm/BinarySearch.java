public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 10};
        int k = 5;
        System.out.println(search(arr, 0, arr.length - 1, k));
    }

    public static boolean search(int arr[], int start, int end, int k) {
        if (start <= end) {
            int mid = start + (end - start) / 2; // Corrected the calculation of mid
            // System.out.println(start + "---" + end);
            // System.out.println(mid);
            if (k == arr[mid]) {
                return true;
            } else if (k < arr[mid]) {
                return search(arr, start, mid - 1, k);
            } else {
                return search(arr, mid + 1, end, k);
            }
        } else {
            return false;
        }
    }
}
