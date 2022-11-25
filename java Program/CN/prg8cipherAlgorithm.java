
public class prg8cipherAlgorithm {
    public static void main(String[] args) {
        String in = "Harish";
        int shift = 4;
        encrypt(in, shift);
    }

    public static void encrypt(String n, int shift) {
        StringBuffer sc = new StringBuffer();
        for (int i = 0; i < n.length(); i++) {
            if (Character.isUpperCase(n.charAt(i))) {
                int d = (int) (n.charAt(i) + shift - 65) % 26 + 65;
                sc.append((char) (d));
            } else {
                int d = (int) (n.charAt(i) + shift - 97) % 26 + 97;
                sc.append((char) (d));
            }
        }
        System.out.println(sc);
    }
}
