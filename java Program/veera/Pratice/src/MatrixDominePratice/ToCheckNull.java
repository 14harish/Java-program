package MatrixDominePratice;
import java.util.Scanner;
public class ToCheckNull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);int row = sc.nextInt();
        int col = sc.nextInt();
        int[][]mat=new int[row][col];
        boolean flag=true;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                mat[i][j]=sc.nextInt();
                if(mat[i][i]!=0){
                    System.out.println("Not Null");
                    flag=false;
                    return;
                }
            }
        }
        if(flag) System.out.println("Null");
    }
}
