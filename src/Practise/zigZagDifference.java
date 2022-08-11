package Practise;

public class zigZagDifference {
public static void main(String[] args) {
	int arr[]= {3,2,4,1,5,2,6,2,5,2};
	int count=0;
	boolean check=true;
	if(arr[0]>arr[1]) {
		check=true;
	}
	else {
		check=false;
	}
	for(int i=0;i<arr.length-1;i++) {
		if(check) {
			if(arr[i]>arr[i+1]) {
				count++;
			}	
		}
		else {
			if(arr[i]<arr[i+1]) {
				count++;
			}
		}
		i=i+1;
	}
	if(count==arr.length/2) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
}
