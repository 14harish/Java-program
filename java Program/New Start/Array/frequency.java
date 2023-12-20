import java.util.*;

public class frequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int arr[]={10,22,22,34,22,10,34,11};
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else{
                h.put(arr[i], 1);
            }
        }
        System.out.println(h);
        
        // Another method
        // int fre[]=new int[max];
        // for(int i=0;i<N;i++){
        //     fre[arr[i]-1]++;
        // }
    }
}
