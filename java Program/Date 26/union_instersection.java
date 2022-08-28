import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.*;
public class union_instersection {
    public static void main(String[] args) {
        int a[]={12,45,62,98,5,28};
        int b[]={98,23,12,145};
       ArrayList<Integer> Intersection=new ArrayList<>();
        ArrayList<Integer> commn=new ArrayList<>();
        HashSet<Integer> union=new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    commn.add(a[i]);
                }
                union.add(a[i]);
                union.add(b[j]);
            }
            if(commn.contains(a[i])){}
            else{
                Intersection.add(a[i]);
            }
        }
        ArrayList<Integer> Sortunion=new ArrayList<>(union);
        Collections.sort(Sortunion);
        System.out.println("Sort Union:"+Sortunion);
        System.out.println("Union:"+union);
        System.out.println("Intersection:"+commn);
        System.out.println("A Minus B:"+Intersection);
    }
}
