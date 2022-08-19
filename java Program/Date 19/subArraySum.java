import java.util.*;
public class subArraySum {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        System.out.println("Enter Starting index");
        int s=sc.nextInt();
        System.out.println("Enter Ending index");
        int e=sc.nextInt();
        for(int i=s;i<=e;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
