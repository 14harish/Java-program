import java.util.*;
public class MergeSort {
    static ArrayList a=new ArrayList<>();
    public static void main(String[] args) {
        
        int arr[]={5,3,2,4,1};
        mergesort(arr, 0, arr.length-1); 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(a.get(a.size()-1));
    }
    public static void mergesort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int m=(l+r)/2;
        mergesort(arr, l, m);//left half
        mergesort(arr, m+1, r); //right half
        merge(arr, l, m, r);
    }
    public static void merge(int arr[],int l,int m,int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m + 1;
    
        while (left <= m && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
    
        // Remaining elements from left
        while (left <= m) {
            temp.add(arr[left]);
            left++;
        }
    
        // Remaining elements from right
        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }
    
        // Copy elements from temp back to arr
        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
            System.out.println(temp);
            a.add(temp);
    }
}
