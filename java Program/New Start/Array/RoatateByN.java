import java.util.ArrayList;

public class RoatateByN {
    public static void main(String[] args) {
        //Rotate the given array by n times toward right 
        int arr[]={1,2,3,4,5};
        int n=3;   
        for(int i = 0; i < n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        }    
        // My methid
        // ArrayList<Integer> a=new ArrayList<>();
        // for(int i=k;i<arr.size();i++){
        //     a.add(arr.get(i));
        // }
        // for(int i=0;i<k;i++){
        //     a.add(arr.get(i));
        // }
        // return a;
    }
}
