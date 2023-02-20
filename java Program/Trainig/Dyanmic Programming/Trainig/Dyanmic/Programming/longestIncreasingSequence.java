import java.util.Scanner;

public class longestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int ar1[] = {5,4,3,6,1}, ar2[] = new int[n], max = 0;
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
            ar2[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (ar1[i] < ar1[j]) {
                    ar2[i] = ar2[j] + 1 > ar2[i] ? ar2[j] + 1 : ar2[i];
                    max = max > ar2[i] ? max : ar2[i];
                }
            }
        }
        System.out.println(max);
    }
}
