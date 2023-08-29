//Spirallly traverse
package SpiraTraversing;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr={{4,5,8},{9,12,67},{45,77,0}};
        int[] sort=new int[arr.length*arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sort[index]=arr[i][j];
                index++;
            }
        }
        index=0;
        int len=arr.length;
        Arrays.sort(sort);
        int rowLower=0,rowUpper=(arr.length-1);
        int colLower=0,colUpper=(arr.length-1);
        while(rowLower<=rowUpper && colLower<=colUpper){
            for(int i=colLower;i<=colUpper;i++){  //to print first row
                arr[rowLower][i]=sort[index];
                index++;
            }
            rowLower++;
            for(int i=rowLower;i<=rowUpper;i++){ //to pring last column
                arr[i][colUpper]=sort[index];
                index++;
            }
            colUpper--;
            if(rowLower>rowUpper||colLower>colUpper) break; //To check the exception

            if (rowLower <= rowUpper) { // Check to avoid redundant traversal if rows are consumed
                for (int i = colUpper; i >= colLower; i--) { // Traverse from right to left along the bottom row
                    arr[rowUpper][i] = sort[index];
                    index++;
                }
                rowUpper--;
            }

            if (colLower <= colUpper) { // Check to avoid redundant traversal if columns are consumed
                for (int i = rowUpper; i >= rowLower; i--) { // Traverse upwards along the leftmost column
                    arr[i][colLower] = sort[index];
                    index++;
                }
                colLower++;
            }

            for(int i=colUpper;i>=colLower;i--){
                arr[rowUpper][i]=sort[index];
                index++;
            }
            rowUpper--;
            for (int i=rowUpper;i>=rowLower;i--){
                arr[i][colLower]=sort[index];
                index++;
            }
            colLower--;
//            break;
        }
        System.out.println(Arrays.toString(sort));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(sort));
    }
}
