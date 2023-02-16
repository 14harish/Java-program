package Trainig.string;

public class reverseSrtringInarr {
    public static void main(String[] args) {
        String c = "", dup = "";
        String str = "ONE TWO THREE";
        for (int i = 0; i < str.length(); i++) {
            // dup+=str.charAt(i);

            if (str.charAt(i) == ' ' || i==str.length()-1) {
                if (i==str.length()-1) {
                    c +=str.charAt(i);
                }
                for (int j = c.length() - 1; j >=0; j--) {
                    System.out.print(c.charAt(j));
                }
                System.out.print(" ");
                c = "";
            } else {
                c += str.charAt(i);
            }
        }
        // System.out.println(dup);
    }
}
