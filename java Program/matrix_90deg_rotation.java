package test;
//90 deg Rotation
public class TwoDMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{4,5,6},{7,8,9}};
        transpose(arr);
    for(int i=0;i< arr.length;i++){
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[i][j]);
        }System.out.println();
    }
}
static void transpose(int arr[][]){
        int temp=0;
    for(int i=0;i< arr.length;i++){
        for(int j=i;j< arr.length;j++){
           // System.out.println(i+"="+j);
          //  System.out.println(j+"="+i);
       temp= arr[i][j];
       arr[i][j]=arr[j][i];
       arr[j][i]=temp;
        }
    }
}
}
