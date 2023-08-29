import java.util.*;
public class Main {
    static void mergeSort(int[]input){
        int length= input.length,mid=length/2;
        int[] leftArr=new int[mid];
        int[] rightArr=new int[length-mid];
        if(length<2) return;
        for(int i=0;i<mid;i++){  //Filling left part of the Array
            leftArr[i]=input[i];
        }
        for(int i=mid;i<length;i++){  //Filling Right part of the Array
            rightArr[i-mid]=input[i];
        }
        mergeSort(leftArr);   //Repeating the steps
        mergeSort(rightArr);

        merge(input,leftArr,rightArr); //Merging the array
    }
    static void merge(int[] input,int[]leftArr,int[]rightArr){      //to join the arrays
        int i=0,j=0,k=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[i]){
                input[k]=leftArr[i];
                i++;
            }
            else{
                input[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i< leftArr.length){
            input[k]=leftArr[i];
            i++;
            k++;
        }
        while(j< rightArr.length){
            input[k]=rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=rand.nextInt(100);
        System.out.println("Before Sort: "+Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After Sort: "+Arrays.toString(arr));
    }
}