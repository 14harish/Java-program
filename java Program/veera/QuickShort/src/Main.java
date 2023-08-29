import java.util.*;
public class Main {
    static void swap (int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void quicksort(int arr[],int lowIndex,int highIndex){
        if(lowIndex>=highIndex) return;
        int pivot=arr[highIndex];
        int leftPoiniter=lowIndex;
        int rightPointer=highIndex;
        while(leftPoiniter<rightPointer){
            while(arr[leftPoiniter]<=pivot && (leftPoiniter<rightPointer))
                leftPoiniter++;
            while(arr[rightPointer]>=pivot && (leftPoiniter<rightPointer))
                rightPointer--;
            swap(arr,leftPoiniter,rightPointer);
        }
        swap(arr,leftPoiniter,highIndex);
        quicksort(arr,lowIndex,leftPoiniter-1);
        quicksort(arr,rightPointer+1,highIndex);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=10;
        int[] arr=new int[len];
        Random ran=new Random();
        for(int i=0;i<len;i++)
            arr[i]=ran.nextInt(100);
        System.out.println("Array before Sorted\n"+Arrays.toString(arr));
        quicksort(arr,0,len-1);
        System.out.println("Array After Sorted\n"+Arrays.toString(arr));

    }
}