package Basic;

public class CountingMethod2 {
public static void main(String[] args) {
	int arr[]= {1,3,2,3,3,2,4,2,2};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
	}
	int count=0;
	for(int i=0;i<arr.length;i++) {
		count=1;
		for(int j=i+1;j<arr.length;j++) {
		  if(arr[i]==arr[j]) {
		    count++;	
		    arr[j]=-1;
		  }
		}
		if(arr[i]!=-1) {
		  System.out.println(arr[i]+" "+count);
	}
	}
}
}
