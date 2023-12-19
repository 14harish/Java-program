public class reverseBit{
    public static void main(String[] args) {
        int n = 12;
        String s="";
        int rem=0;
        for(int i=0;i<32;i++){
            if(n>0){
              rem=n%2;
              s+=rem;
              n=n/2;
            }
            else{
                s+="0";
            }
        }
        long l=1,ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans+=l;
            }
            l*=2;
        }
        System.out.println(s);
        System.out.println(ans);
    }
}