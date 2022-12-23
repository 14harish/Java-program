import java.util.logging.Handler;

import javax.imageio.IIOException;

public class techNum {
    public static void main(String[] args) {
        int n=2025,sum=0;
        StringBuffer sc=new StringBuffer(n+"");
        sc.insert(sc.length()/2, " ");
        String s=sc.toString();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
           // System.out.println(arr[i]);
            sum+=Integer.parseInt(arr[i]);
        }
        sum=sum*sum;
        System.out.println(sum==n);
       // System.out.println(n%100);
       //method 1 to spit 
       // String s=n+"";
        // s=s.substring(0,s.length()/2)+" "+s.substring(s.length()/2);
        //System.out.println(sc);
    }
}
