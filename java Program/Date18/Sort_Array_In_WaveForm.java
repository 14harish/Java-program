package Date18;

public class Sort_Array_In_WaveForm {
 public static void main(String[] args) {
    int arr[]={ 24,5,2,67,10,34,7};
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
         if(arr[i]>arr[j]){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
         }
      }
    }
    int m=0;
    if(arr.length%2==0){
      m=0;
    }
    else{
      m=1;
    }
    for(int i=0;i<arr.length-m;i++){
      // try{
      arr[i]=arr[i]+arr[i+1];
      arr[i+1]=arr[i]-arr[i+1];
      arr[i]=arr[i]-arr[i+1];
      i++;
      // }
      // catch(Exception e){
      
      // }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
 }   
}
