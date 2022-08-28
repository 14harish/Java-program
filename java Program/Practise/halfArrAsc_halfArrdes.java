package Practise;

public class halfArrAsc_halfArrdes {
    public static void main(String[] args) {
        int arr[]={1,7,4,23,65,2,12,45,18,35};
        for(int i=0;i<arr.length;i++){
               // System.out.print(arr[i]+" ");
              for(int j=i+1;j<arr.length;j++){ 
                if(i>arr.length/2){
                    if(arr[i]<arr[j]){
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                    }
                }
                if(i<arr.length/2){  
                    if(arr[i]>arr[j]){
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                    }
                }
               
            }
        }
            //     for(int k=arr.length/2;k<arr.length;k++)
                
            // }
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        
}
    }}

