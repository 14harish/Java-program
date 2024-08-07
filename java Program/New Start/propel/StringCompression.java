public class StringCompression {
    public static String compressString(String input) {
    // StringBuilder compressed = new StringBuilder();
    StringBuffer compressed = new StringBuffer();
    int count = 1;
    for (int i = 1; i < input.length(); i++) {
    if (input.charAt(i) == input.charAt(i - 1)) {
       count++;
    } else {
        compressed.append(count);
        compressed.append(input.charAt(i - 1));
        count = 1;
    }
    }
    compressed.append(count);
    compressed.append(input.charAt(input.length() - 1));
    return compressed.toString();
    }
    public static void main(String[] args) {
            String input = "aaaabbbccccdd";
            String compressedString = compressString(input);
            System.out.println(compressedString);
    } 
}