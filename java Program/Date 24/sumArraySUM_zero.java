
public class sumArraySUM_zero {
    public static void main(String[] args) {
        int ar[]= {4  ,2 ,-3 ,1,6};
       ma(0,ar);
   }
   public static void ma(int a,int []ar) {
       int sum =0;
       for (int i = a; i < ar.length; i++) {
           if(ar[i]==0) {
               System.out.println("yes");
               break;
           }else {
               sum+=ar[i];
           }
           if(sum==0) {
               System.out.println("yes");
               break;
           }
           }
       if(sum!=0){
           ma(a+1,ar);
       }
   }

}
