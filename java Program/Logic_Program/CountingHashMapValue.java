import java.util.HashMap;

public class CountingHashMapValue {
    public static void main(String[] args) {
        char arr[]={'a','b','c','a','b','a','v','v','a'};
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else{
                h.put(arr[i],1);
            }
        }
        System.out.println(h);
    }
}
