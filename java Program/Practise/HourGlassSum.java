public class HourGlassSum {
    public static void main(String[] args) {
        int arr[][]={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                // System.out.print(arr[i][j]+" "+arr[i][j]);
                if(i==1 || i==4){
                   System.out.println(i+" "+i);
                    // sum+=arr[i][i];
                  }
                  else{
                    //  sum+=arr[i][j];
                  }
            }
            System.out.println();
        }

    }   
}
