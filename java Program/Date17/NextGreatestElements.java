package Date17;

public class NextGreatestElements {
    public static void main(String[] args) {
        int arr[]={9,9,4,2,8,0};
        int dup[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
             //  System.out.println(arr[i]+"-"+arr[j]);
               if(arr[i]<arr[j]){
                dup[i]=arr[j];
                break;
               }
               else{
                dup[i]=-1;
               }
            }
        }
        dup[dup.length-1]=-1;
        for(int i=0;i<arr.length;i++){
            System.out.println(dup[i]);
        }
    }
}
