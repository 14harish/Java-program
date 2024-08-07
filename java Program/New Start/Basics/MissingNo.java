import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int r=0;
        int n=10;
        int array[]={6,1,2,8,3,4,7,10,5 };
        Arrays.sort(array);
        if(array.length!=1){
        for(int i=0;i<n-2;i++){
            // System.out.println(array[i]);
            if(Math.abs(array[i]-array[i+1])!=1){
                r=array[i]+1;
            }
        }
        }else{
            if(array[0]>1){
                r=array[0]-1;
            }else{
               r=array[0]+1;
            }
        }
        if(r==0){
            if(array[0]!=1){
                r=1;
            }else{
            r=array[array.length-1]+1;
        }
        }
    }
}
