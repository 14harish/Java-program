import java.util.ArrayList;

public class kthELementof2sortedArray {
    public static void main(String[] args) {
         int i=0,j=0;
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        int n=arr1.length,m=arr2.length;
        ArrayList<Integer> a=new ArrayList<>();
        while(i<n && j<m){
         if(arr1[i]<arr2[j]){
             a.add(arr1[i]);
             i++;
         }else if(arr1[i]>arr2[j]){
             a.add(arr2[j]);
             j++;
         }else{
             a.add(arr1[i]);
             a.add(arr2[j]);
             i++;
             j++;
         }   
        }
         while (i < n) {
            a.add(arr1[i]);
            i++;
        }
        while (j < m) {
            a.add(arr2[j]);
            j++;
        }
        System.out.println(a);
    }
}
