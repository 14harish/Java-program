/* IN:[1,3,2,4]
Next Greater element if not print-1;
OP:3 4 4 -1*/
package NextGreaterElement;
public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        for(int i=0;i<arr.length;i++){
            int temp=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    break;
                }
            }
            System.out.print(temp+" ");
        }
    }
}
