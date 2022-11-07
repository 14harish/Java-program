public class snakePattern {
    public static void main(String[] args) {
        int mat[][] = { {1, 3, 4},
        {4, 2, 1},
        {7, 8, 2}};
       StringBuffer sc=new StringBuffer();
       StringBuffer s=new StringBuffer();
       for(int i=0;i<mat.length;i++){
        if(i%2==0){
        for(int j=0;j<mat.length;j++){
            sc.append(mat[i][j]+" ");
        }}
        else{
        for(int k=mat.length-1;k>=0;k--){
            sc.append(mat[i][k]+" ");
        }
      }
       }
       System.out.println(sc);
    }
}
