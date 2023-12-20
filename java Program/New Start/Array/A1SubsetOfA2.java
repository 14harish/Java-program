import java.util.ArrayList;

public class A1SubsetOfA2 {
    public static void main(String[] args) {
        ArrayList<Long> h=new ArrayList<>();
        int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int a2[] = {11, 3, 7, 1, 7};
        int n=a1.length,m=a2.length;
        for(int i=0;i<n;i++){
            h.add(a1[i]);
        }
        for(int i=0;i<m;i++){
            int index=h.indexOf(a2[i]);
            if(index!=-1){
                h.remove(index);
            }else{
                System.out.println("NO");
            }
        }
        System.out.println("Yes");
    }
}
