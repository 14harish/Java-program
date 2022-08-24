import java.util.*;
public class equilibrium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the Elements");
        for(int i=0;i<s;i++) {
        arr[i]=sc.nextInt();
        }
        int sum1=0,sum2=0;
        for (int i = 0; i < arr.length; i++) {
        if(i<(arr.length/2)) {
        sum1+=arr[i];
        }else if(i>arr.length/2) {
        sum2+=arr[i];
        }
        }
        if(sum1==sum2) {
        System.out.println(arr.length/2);
        }else {
        System.out.println("-1");
        }
        }
        }