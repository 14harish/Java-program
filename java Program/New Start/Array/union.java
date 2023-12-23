import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int a[]={102,20,02,23};
        int b[]={102,02,2};
        int n=a.length;
        int m=b.length;
         HashSet<Integer> h=new HashSet();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int j=0;j<m;j++){
            h.add(b[j]);
        }
        System.out.println(h);    
    }
}
