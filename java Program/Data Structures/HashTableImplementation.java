import java.util.*;
public class HashTableImplementation {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable<Integer,String>();        
        h.put(21, "Diavakaran Uncle");
        h.put(30, "Harish");
        h.put(28, "Hariharan");
        h.put(10, "Barath");
        h.put(501, "Arun");
        System.out.println(h);
        System.out.println();
        System.out.println(h.get(30));
    }
}
