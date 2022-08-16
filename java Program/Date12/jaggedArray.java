import java.util.*;
public class jaggedArray {
    //Addition of jagged Array
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];
        int arr1[][]=new int[3][];
        arr1[0]=new int[3];
        arr1[1]=new int[2];
        arr1[2]=new int[1];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements 2");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+arr1[i][j]);
            }
            System.out.println();
        }
    }
}
