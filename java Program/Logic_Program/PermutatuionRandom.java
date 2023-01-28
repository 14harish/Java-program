import java.util.*;

public class PermutatuionRandom {
    public static void main(String[] args) {
        char arr[]={'A','B','C'};
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
       Collections.shuffle(a);
       //    System.out.println(a);
    }
}
