import java.util.ArrayList;
import java.util.List;

public class SpiralPrg {
    public static void main(String[] args) {
      int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      List<Integer> a=new ArrayList<>();
      int rowS=0,rowE=m.length;
      int colS=0,colE=m[0].length;
      while(rowS<rowE && colS<colE){
         for(int i=colS;i<colE;i++){
               a.add(m[rowS][i]);
         }
         rowS+=1;
         for(int i=rowS;i<rowE;i++){
               a.add(m[i][colE-1]);
         }
         colE-=1;
         for(int i=colE-1;i>=colS;i--){
                a.add(m[rowE-1][i]);
         }
         rowE-=1;
         for(int i=rowE-1;i>=rowS;i--){
                a.add(m[i][colS]);
         }
         colS=+1;
      
      }
      System.out.println(a);
    }
}
