
public class setMatrixZero {
    public static void main(String[] args) {
        int m[][]={{1,1,1},{1,0,1},{1,1,1}};
        int arr[][]=new int[m.length][m[0].length];
        int l1=m.length;
        int l2=m[0].length;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                arr[i][j]=m[i][j];
            }
        }
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(m[i][j]==0){
                    for(int x=0;x<l2;x++){
                        arr[i][x]=0;  //seting all colum to zero
                    }
                    for(int y=0;y<l1;y++){
                        arr[y][j]=0;  //seting all row to zero
                    }
                }
            }
        }
         for(int i=0;i<l1;i++,System.out.println()){
            for(int j=0;j<l2;j++){
                m[i][j]=arr[i][j];
                System.out.print(arr[i][j]);
            }
        }
    }
    }    