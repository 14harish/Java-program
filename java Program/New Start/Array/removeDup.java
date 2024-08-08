import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class removeDup {
    public static void main(String[] args) {

        //this method used for only sorted use hahset for other method
        int arr[] = {1,2,2,3,3,4,5};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                System.out.println(arr[i]+"---"+arr[j]);
                i++;
                arr[i] = arr[j];
            }
        }

        for (int p = 0; p < i+1; p++) {
            System.out.print(arr[p] + " ");
        }

        HashMap<Integer,Integer> h=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            if(h.containsKey(arr[j]))
            h.put(arr[j],h.get(arr[j])+1);
            else
            h.put(arr[j],1);
            }
            System.out.println(h);
            for(Map.Entry<Integer,Integer> m:h.entrySet()){
                // System.out.println(h.get(arr[j]));
                System.out.println(m.getKey());
                System.out.println(m.getValue());
            }
            }

    }
