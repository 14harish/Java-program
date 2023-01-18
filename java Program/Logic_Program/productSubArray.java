import java.util.ArrayList;

public class productSubArray{
    public static void main(String[] args) {
        int arr[]={2,-4,3,1,0,2,3,0,5};
        ArrayList<Integer> a=new ArrayList<>();
        int pro=arr[0];
        int pro1=0;
        for(int i=1;i<arr.length;i++){
            System.out.println(pro+"*"+arr[i]+"="+arr[i]*pro);
            pro=arr[i]*pro;
            System.out.println(pro);
            if(pro1<pro){
                pro1=pro;
            }else{
                pro=arr[i];
            }
        }
        if(arr[arr.length-1]>pro1){
            pro1=arr[arr.length-1];
        }
        System.out.println(pro1);
    }
}