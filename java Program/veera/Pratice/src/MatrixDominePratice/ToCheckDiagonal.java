package MatrixDominePratice;
import java.util.Scanner;
public class ToCheckDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                mat[i][j]=sc.nextInt();
                if ((i==j && mat[i][j]==0)||(i!=j && mat[i][j]!=0)){
                    System.out.println("Not Diagonal");
                    return;
                }
            }
        }
        for(int i=0;i<mat.length-1;i++){
            if(mat[i][i]!=mat[i+1][i+1]){
                System.out.println("Not Diagonal");
                return;
            }
        }
        System.out.println("Diagonal");
    }
}
