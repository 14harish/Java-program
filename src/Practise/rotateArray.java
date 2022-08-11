package Practise;

public class rotateArray {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7,5};
	int arr1[]=new int[arr.length];
	int index=3;
	for(int i=0;i<arr.length;i++) {
		arr1[index]=arr[i];
		index++;
		if(index==arr.length) {
			index=0;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr1[i]);
	}
}
}
