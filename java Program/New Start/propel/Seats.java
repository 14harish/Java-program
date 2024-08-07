import java.util.*;
public class Seats {
public static void main(String[] args) {
// TODO Auto-generated method stub
    int a[]= {12,2,7,11};
    int count=0;
    boolean b[]=new boolean[a[0]+1];
     for(int i=1;i<a.length;i++) {
       b[a[i]]=true;
         }
        System.out.println(Arrays.toString(b));
    for(int i=1;i<=a[0];i++) {
        if(!b[i]) {
            System.out.println("Seat number "+i+" is available");
            System.out.println(i+1+"----"+(i+2));
           if(i+1<= a[0] && i%2==1 && !b[i+1]) {
               count++;
            } 
           if(i+2<= a[0] && i%2==1 && !b[i+2]) {
               count++;
            } 
           if(i+2<= a[0] && i%2==0 && !b[i+2]) {
               count++;
            }
            System.out.println(count);

        }
    }
System.out.println(count);
}
}