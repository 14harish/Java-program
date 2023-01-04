import java.util.ArrayList;
import java.util.HashSet;

public class LongestConscutiveElement {
    public static void main(String[] args) {
        int arr[]={49, 1, 3, 200, 2, 4, 5,50,51,52,53,54,55,2,1};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        HashSet<Integer> h=new HashSet<>();
        for (int i : arr) {
            // System.out.println(i);
            h.add(i);
        }
        ArrayList<Integer> a=new ArrayList<>(h);
        int count=0,Max=0;
        for(int i=0;i<a.size()-1;i++){
            if(Math.abs(a.get(i)-a.get(i+1))==1){
                // System.out.println(a.get(i)+"-"+a.get(i+1));
                count++;
            }else{                       
                // System.out.println(count);
                if(count>Max){
                    Max=count;
                    count=0;
                }
            }
        }
        if(count>Max){
            Max=count;
        }
        System.out.println(a);
        System.out.println((Max+1));
    }
}
