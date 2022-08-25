
//Not completed
public class given_values_are_magic_square_or_not {
    public static void main(String[] args) {
        int arr[][]={{2,3,6},{9,5,1},{4,3,8}};
        int sum=0,sum2=0,k=0,count=0;
        int diff=arr[0][0]+arr[1][0]+arr[2][0];
        for(int i=0;i<arr.length;i++){
            k=0;
            for(int j=0;j<arr.length;j++){
            System.out.println(k+"="+i);  
            sum+=arr[i][k];
            sum2+=arr[k][i];
            System.out.println(sum+"-"+sum2);
              k++;    
            }
           // 
            if(sum==diff && sum2==diff){
                count++;
                continue;
            }
            else{
                sum=0;
                sum2=0;
            }
        }
        System.out.println(count);
        if(sum!=0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        // System.out.println(diff);
        // System.out.println(sum);
    }
}
