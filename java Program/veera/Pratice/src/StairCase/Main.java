/*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where
 the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
Example:
8
*
* *
* * *
* * */
package StairCase;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int stair=sc.nextInt();
        int temp=stair;
        for(int i=0;i<temp;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
                stair--;
                if(stair==0) return;
            }
            System.out.println();
        }
    }
}
