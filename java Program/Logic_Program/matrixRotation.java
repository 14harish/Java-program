public class matrixRotation {
        public static void main(String[] args) {
            int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
            int temp=0;
            System.out.println("Orginal Matrix:");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }System.out.println();
            }
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            System.out.println("Rotation Matrix");
            for(int i=arr.length-1;i>=0;i--){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }System.out.println();
            }
        }    
}
