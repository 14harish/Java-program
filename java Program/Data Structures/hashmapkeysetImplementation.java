import java.util.HashMap;

public class hashmapkeysetImplementation {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(30, "Harish");
        h.put(10, "Barath");
        h.put(28, "hariharan");
        h.put(21, "hariharan");
        h.remove(21);
        h.replace(28, "hari");
        h.putIfAbsent(12, "deepak");
        String ha=h.toString();
        System.out.println(ha);
        System.out.println(h);
    }
}
