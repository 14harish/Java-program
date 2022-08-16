import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddpattern {
    public static void main(String[] args) {
        int arr[]={9, 8, 13, 2, 19, 14,12};
        Arrays.sort(arr);
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> full=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        System.out.println(odd+"-"+even);
        if(arr[0]%2==0){
            for(int i=0;i<even.size();i++){
                full.add(even.get(i));
                for(int j=0;j<odd.size();j++){
                    full.add(odd.get(j));
                }
                }
            }
        else{
        }
         System.out.println(full);
}
}
