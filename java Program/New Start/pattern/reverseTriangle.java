public class reverseTriangle {
    public static void main(String[] args) {
        int n=7;
        // for(int i=n-1;i>=0;i--,System.out.println()){
        //     for(int k=n-i;k>0;k--){
        //         System.out.print(" ");
        //     }
        //     for(int j=2*i+1;j>0;j--){
        //         System.out.print("*");
        //     }
        // }
        for (int i = 0; i < n; i++) {
            String s="",s1="";
            for (int j = 0; j < n; j++) {
                if(i<j){
                    s+=" ";
                    s1=" "+s1;
                }
                else{
                    s+=(j+1)+"";
                    // if(j!=n-1)
                    s1=(j+1)+""+s1;
                }
            }
            System.out.println(s+""+s1);
        }
    }
}
