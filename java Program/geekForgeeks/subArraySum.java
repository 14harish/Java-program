package geekForgeeks;

import java.util.ArrayList;

public class subArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        ArrayList<Integer> a=new ArrayList<>();
        int s=12;
        int sum=0,count=0,n=0;
        for(int i=n;i<arr.length;i++){
            sum+=arr[i];
            count++;
            System.out.print(arr[i]+"-->");
            // System.out.println(sum);
            if(sum==s){
                a.add(i);
                a.add(count+i);
                break;
            }
            if(i==arr.length-1){
                sum=0;
                n++;
                i=n-1;
            }
        }
        System.out.println(a);
    }
}
