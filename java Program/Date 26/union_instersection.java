import java.util.ArrayList;
import java.util.HashSet;
import java.*;
public class union_instersection {
    public static void main(String[] args) {
        int a[]={12,45,62,98,5,28};
        int b[]={98,23,12,145};
        ArrayList<Integer> commn=new ArrayList<>();
        ArrayList<Integer> Intersection=new ArrayList<>();
        ArrayList<Integer> Sortunion=new ArrayList<>();
        HashSet<Integer> union=new HashSet();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[i]){
                    System.out.println(a[i]);
                    commn.add(a[i]);
                }
                else{
                    Intersection.add(a[i]);
                }
            }
        }
        System.out.println("Sort Union:"+Sortunion);
        System.out.println("Union:"+union);
        System.out.println("Common:"+commn);
        System.out.println("Common:"+Intersection);
    }
}
