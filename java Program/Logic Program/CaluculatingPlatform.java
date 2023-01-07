public class CaluculatingPlatform {
    public static void main(String[] args) {
        int arival[]={100,140,150,200,215,400};
        int depature[]={110,300,220,230,315,600};
        int count=1,max=1;
        for(int i=0;i<arival.length-1;i++){
            // int arrive=arival[i];
            // System.out.println(arival[i+1]+"---"+depature[i]+"------");
            if(arival[i+1]>depature[i]){
                count=1;
                // count--;
            }else{
                //with for loop
                // for(int j=i;j<depature.length;j++){
                    //     // System.out.println(arival[j+1]+"---"+depature[i]);
                    //     if(arival[j+1]>depature[i]){
                   //         break;
                    //     }
                  //     count++;
                 // }  
                 //with while loop
                int j=i;
                while(arival[j+1]<=depature[i]){
                    count++;
                    j++;
                }
             }
            //  System.out.println(count);
             if(count>max){
                max=count;
                count=0;
             }
        }
        System.out.println(max);
    }
}
