import java.util.ArrayList;

public class subArraySum{
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int s=12,sum=0,count=0,n=0;
        ArrayList<Integer> sc=new ArrayList<>();
        for(int i=n;i<arr.length;i++){
            sum+=arr[i];
            count++;
            if(sum==s){
                sc.add(n+1);
                sc.add(count+n);
            }
            if(i==arr.length-1){
                sum=0;
                count=0;
                n++;
                i=n-1;
            }
        }
        System.out.println(sc);
    }
}