
public class hourglass_3into3_sum {
public static void main(String[] args) {
    int arr[][]={{1,3,3},{4,3,6},{7,3,9}};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
            if(i==arr.length-2){
              sum+=arr[i][i];
              break;
            }
            else{
                sum+=arr[i][j];
            }
        }
        System.out.println();
    }
    System.out.println(sum);
}
}