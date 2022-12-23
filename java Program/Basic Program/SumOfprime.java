

public class SumOfprime {
public static void main(String[] args) {
	int arr[]= {2,4,6,9,11};
	int sum=0;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=2;j<arr[i];j++) {
			if(arr[i]%j==0) {
				count++;
			}
		}
		if(count==0) {
		sum+=arr[i];
		}
		count=0;
	}
	System.out.println(sum);
}
}
