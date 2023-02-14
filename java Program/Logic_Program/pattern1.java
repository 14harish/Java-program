public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            int row = i < n ? i : (2 * n) - i;
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 2 * n; i++) {
            int row = i < n ? i : (2 * n) - i;
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2 * n; i++) {
            int row = i < n ? i : (2 * n) - i;
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < n*2-row*2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        //both two for loop used for one
        for (int i = 0; i <=n; i++) {
            // int row = i < n ? n-i : n*2 - i;
            for (int j = 0; j <=n-i; j++) {
                System.out.print("*");
            }
            for (int s = 0; s<i*2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i<=n; i++) {
            for (int j =0; j<=i; j++) {
                System.out.print("*");
            }
            for (int s = n*2-i*2; s>0;s--) {
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
