import org.omg.CORBA.IntHolder;

public class given_values_are_magic_square_or_not {
    public static void main(String[] args) {
        int arr[][]={{2,7,6},{9,5,1},{4,3,8}};
        int dup[][]=Transpose(arr);
        int sum=0,sum2=0,sum3=0,sum1=0,k=0,count=0;
        int diff=arr[0][0]+arr[0][1]+arr[0][2];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            k=0;
            for(int j=0;j<arr.length;j++){
           if(i==j){
            System.out.println(arr[i][j]);
            sum3+=arr[i][j];
            sum1+=dup[i][j];
           }
            sum+=arr[i][k];
            sum2+=arr[k][i];
              k++;    
            }
            if(sum==diff && sum2==diff){
                count++;
                sum2=0;sum=0;
                continue;
            }
            else{
               sum=0;sum2=0;
            }
        }
        if(count==arr.length && sum3==diff && sum1==diff){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    static int[][] Transpose(int arr[][]){
        int dup[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                dup[i][j]=arr[i][j];
               }
        }
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr.length/2;j++){
                temp=dup[i][j];
			    dup[i][j]=dup[i][arr.length-1];
		 	    dup[i][arr.length-1]=temp;
           }
        }
        return dup;
    }
}
//Test case false
// 1   2   2 
// 2   2   1
// 2   1   2
