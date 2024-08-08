public class reverseBit{
    public static void main(String[] args) {
        int n = 12;
        String s="";
        String wel="";
        int rem=0;
        for(int i=0;i<32;i++){
            if(n>0){
              rem=n%2;
              System.out.println(s);
              wel=rem+wel;
              s+=rem;
              n=n/2;
            }
            else{
                s+="0";
            }
        }
        System.out.println(wel);
        long l=1,ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans+=l;
            }
            l*=2;
        }
        int w=0;
        int e=1;
        for(int i=wel.length()-1;i>=0;i--){
            if(wel.charAt(i)=='1'){
                w+=e;
            }
            e*=2;
        }
        System.out.println(w);
        System.out.println(s);
        System.out.println(ans);
    }
}