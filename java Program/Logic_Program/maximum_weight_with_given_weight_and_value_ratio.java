public class maximum_weight_with_given_weight_and_value_ratio {
    public static void main(String[] args) {
        int wei[]={3,9,8};
        int hei[]={2,6,4};
        int k=2;
        int w=0,h=0,find=0;
        // for(int i=0;i<wei.length;i++){
        //     w+=wei[i];
        //     h+=hei[i];
        //     // System.out.println(wei[i]+"-"+hei[i]);
        //     int d=w/h;
        //     System.out.println(w+"/"+h+"="+d);
        //     if(d==k){
        //         System.out.println("--"+w);
        //         if(w>find){
        //             find=w;
        //         }
        //     }
        // }
        // w=wei[i];
        //     h=hei[i];
        for(int i=0;i<wei.length;i++){
            for(int j=i;j<wei.length;j++){
                if(i==j){
                    w=wei[i];
                    h=hei[i];
                }else{
                    w=wei[i]+wei[j];
                    h=hei[i]+hei[j];
                    // System.out.println(i+"---"+j);
                }
                // System.out.println(w+" "+h);
            }
            
            if(w/h==k){
                if(w>find){
                  find=w;
                }
            }
        }
        System.out.println(find);
    }
}
