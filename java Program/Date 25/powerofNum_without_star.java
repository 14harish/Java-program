public class powerofNum_without_star {
    public static void main(String[] args) {
        int n=6;
        int p=2,re=0,dup=n,d=n;
        for(int i=0;i<p-1;i++){
            re=0;
           while(dup!=0){
            re+=d;
            dup--;
           }
           dup=n;
           d=re;
        }
        System.out.println(re);
    }
}
