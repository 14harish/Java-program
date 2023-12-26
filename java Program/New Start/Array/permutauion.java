import java.util.*;
public class permutauion {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int arr[]={1,2,3,4};
        System.out.println("Given array is");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        recurPermutation(arr, 0, ans);
        System.out.println(ans);
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void recurPermutation(int arr[],int index,List<List<Integer>> ans){
        if(index==arr.length){
            List<Integer> a=new ArrayList<>();
            for(int i:arr){
                a.add(i);
            }
            ans.add(a);
        }
        for(int i=index;i<arr.length;i++){
            swap(arr, index, i);
            recurPermutation(arr, index+1, ans);
            swap(arr, index, i); //backtracking make it is orginal
        }
    }
}
