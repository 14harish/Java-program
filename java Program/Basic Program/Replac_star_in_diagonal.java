import java.util.*;
public class Replac_star_in_diagonal{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Size:");
        int s=sc.nextInt();
        int arr[][]=new int[s][s];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    System.out.print("*"+" ");
                }
                else{
                System.out.print(arr[i][j]+" ");
                }
            }System.out.println();
        }
    }
}