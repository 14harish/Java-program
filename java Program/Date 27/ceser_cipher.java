public class ceser_cipher {
    public static void main(String[] args) {
        String in="Hello";
        StringBuffer sc=new StringBuffer();
        int key=5;
        for(int i=0;i<in.length();i++){
            sc.append((char)(in.charAt(i)+5));
        }
        System.out.println(sc);
    }
}
