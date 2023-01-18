import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LongestConscutiveElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,17,18,19,20,21,22,23,24,45};//{49, 1, 3, 65, 2, 4, 5,50,51,52,53,54,55,2,1}
        HashSet<Integer> h=new HashSet<>();
        for (int i : arr) {
            // System.out.println(i);
            h.add(i);
        }
        // System.out.println(h);
        ArrayList<Integer> a=new ArrayList<>(h);
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)>a.get(i+1)){
                // int temp=a.get(i);
                // a.add(i,a.get(i+1));
                // // a.get(i)=a.get(i+1);
                // a.add(i+1,temp);
                // // arr[i+1]=temp;
                Collections.swap(a,i,i+1);
                i=-1;
                // System.out.println(a);
            }
        }
        System.out.println(a);
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
        // System.out.println(a);
        System.out.println((Max+1));
    }
}
