public class HourGlassSum {
    public static void main(String[] args) {
        int arr[][]={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int max=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-2;j++){
             //  System.out.print(arr[i][j]+" ");
               int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1]) + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
               System.out.println((arr[i][j] +" "+ arr[i][j + 1] +" "+ arr[i][j + 2]) +" "+ (arr[i + 1][j + 1]) +" "+ (arr[i + 2][j] +" "+ arr[i + 2][j + 1] +" "+ arr[i + 2][j + 2]));
               System.out.println(sum);
               if(sum>max){
                max=sum;
               }
            }
            System.out.println();
        }
        System.out.println(max);
    }   
}
