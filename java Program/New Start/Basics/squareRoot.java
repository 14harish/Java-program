public class squareRoot {
    public static void main(String[] args) {
        int x=30;
        if (x == 0 || x == 1){
            System.out.println(x);
        }
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        System.out.println(i-1);
    }
}
