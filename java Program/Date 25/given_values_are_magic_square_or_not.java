

public class given_values_are_magic_square_or_not {
    public static void main(String[] args) {
        int arr[][]={{1,2,2},{2,2,1},{2,1,2}};
        int sum=0,sum2=0,sum3=0,sum1=0,k=0,k1=arr.length-1,count=0;
        int diff=arr[0][0]+arr[0][1]+arr[0][2];
        for(int i=0;i<arr.length;i++){
            k=0;
            for(int j=0;j<arr.length;j++){
           if(i==j){
            sum3+=arr[i][j];
            sum1+=arr[i][k1];
            k1--;
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
        System.out.println(count==arr.length && sum3==diff && sum1==diff);
    }
}
//Test case false
// 1   2   2 
// 2   2   1
// 2   1   2
