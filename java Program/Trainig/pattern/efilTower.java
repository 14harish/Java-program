
public class efilTower {
    public static void main(String[] args) {
        int n = 5;
        int k = n;
        int inc=1;
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= k; j++) {
                for (int g = 0; g < inc; g++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            inc+=2;
            k--;
        }
    }
}
