import java.util.Scanner;

public class longestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar1[] =new int[n], ar2[] = new int[n],c[] = new int[n], min=0,max = 0;
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
            ar2[i] = 1;
            c[i] = 1;

        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                //longest Increasing Sequence
                if (ar1[i] < ar1[j]) {
                    ar2[i] = ar2[j] + 1 > ar2[i] ? ar2[j] + 1 : ar2[i];
                    max = max > ar2[i] ? max : ar2[i];
                }
                //longest Decreasing Sequence
                if (ar1[i] > ar1[j]) {
                    c[i] = c[j] + 1 > c[i] ? c[j] + 1 : c[i];
                    min = min > c[i] ? min : c[i];
                }
            }
        }
        System.out.println(max+"--"+min);
    }
}
