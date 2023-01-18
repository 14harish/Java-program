//90 deg Rotation
public class MatrixDegRotation {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{4,5,6},{7,8,9}};
        //90deg rotation
        transpose(arr);
        reverse(arr);
        //180DEG Rotation
//        transpose(arr);
//        reverse(arr);
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
static void reverse(int arr[][]) {
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length/2;j++) {
			temp=arr[i][j];
			arr[i][j]=arr[i][arr.length-1];
			arr[i][arr.length-1]=temp;
		}
	}
}
}
