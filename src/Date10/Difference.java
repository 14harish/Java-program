package Date10;

public class Difference {
public static void main(String[] args) {
	int arr[]= {4,6,9,12,17,19};
	int count=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]<arr[i+1]) {
			count++;
		}
	}
	if(count==arr.length-1) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
