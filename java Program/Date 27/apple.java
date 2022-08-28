public class apple {
   public static void main(String[] args) {
    int n=18;
    int count1=5,cost1=30;
    int count2=3,cost2=25;
    int c1=fCount(count1, n)*cost1;
    int c2=fCount(count2, n)*cost2;
    if(c1<c2){
        System.out.println("Shop one is best...."+"RS:"+c1);
    }
    else{
        System.out.println("Shop Two is best...."+"RS:"+c2);
    }
   } 
   static int fCount(int count1,int n){
    int c=0,c1=count1;
    while(true){
        c++;
        if(c1>=n){
            break;
        }
        c1=c1+count1;
    }
    return c;
   } 
}
