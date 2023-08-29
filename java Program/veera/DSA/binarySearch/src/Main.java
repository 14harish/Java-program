import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int left=0,right=arr.length-1;
        int element=sc.nextInt();
        boolean flag=false;
        while(left<=right){
            int mid=(left+right)/2;
            if(element==arr[mid]) {
                flag=true;
                System.out.println("Element found in " + mid);
                break;
            }
            else if(element<arr[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        if(flag==false) System.out.println("Element Not Found!!");
    }
}