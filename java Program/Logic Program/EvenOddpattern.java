import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddpattern {
    public static void main(String[] args) {
        int arr[]={9,8,13,2,19,14};
        //9, 8, 13, 2, 19, 14,12
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
        int size=(even.size()>odd.size()) ? odd.size():even.size();
        System.out.println(odd+"-"+even);
        System.out.println(size);
        if(arr[0]%2==0){
            for(int i=0;i<size;i++){
                full.add(even.get(i));
                full.add(odd.get(i));
                }
            if(even.size()<odd.size()){
                full.add(odd.get(odd.size()-1));
            }
            if(even.size()>odd.size()){
                full.add(even.get(even.size()-1));
            }
        }
        else{
            for(int i=0;i<size;i++){
                full.add(odd.get(i));
                full.add(even.get(i));
                }
            if(even.size()<odd.size()){
                full.add(odd.get(odd.size()-1));
            }
            if(even.size()>odd.size()){
                full.add(even.get(even.size()-1));
            }
        }
         System.out.println(full);
}
}
