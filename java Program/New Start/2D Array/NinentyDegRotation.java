
public class NinentyDegRotation {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}};
              int n=arr.length;              
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // Reverse
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[(n-i)-1][j];
                arr[(n-i)-1][j]=temp;
            }
        }
        // print
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
