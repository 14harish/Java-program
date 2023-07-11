import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={2,1,4,3,6,5,8,7};
        // arr=mergeSort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(mergeSort(arr)));
    }

public static int[] mergeSort(int arr[]){
    if (arr.length == 1){
        return arr;
    }

    int mid=arr.length/2;

    int left[]=mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int right[]=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left,right);
}

public static int[] merge(int l[],int r[]){
    int res[]=new int[l.length+r.length];
    int i=0,j=0,k=0;
    while(i<l.length && j<r.length){
        if(l[i]<r[j]){
            res[k++]=l[i++];
        }else{
            res[k++]=r[j++];
        }
    }
    while(i < l.length ){
        res[k++]=l[i++];
    }
    while(j < r.length ){
        res[k++]=r[j++];
    }
    return res;
}
}