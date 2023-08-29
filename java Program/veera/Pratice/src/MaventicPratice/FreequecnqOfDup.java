/*10
7 5 4 6 8 4 4 4 7 5
7-->2
5-->2
4-->4*/
package MaventicPratice;
import java.util.*;
public class FreequecnqOfDup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        int cnt=-1;
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<len;i++){
            int freq=0;
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]) freq++;
                if(freq>1&& arr[i]==arr[j]){
                    arr[j]=cnt;
                    cnt--;
                }
            }
            if(freq>1) System.out.println(arr[i]+"-->"+freq);
        }
    }
}
