package Practise;

public class EqualeDifference {
public static void main(String[] args) {
	int arr[]= {1,5,9,13,17,21};
	int diff=arr[1]-arr[0],d=0,count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]<arr[i+1]) {
			d=arr[i+1]-arr[i];
			if(d==diff){
				count++;
			}
		}
	}
	if(count==arr.length-1) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
}
