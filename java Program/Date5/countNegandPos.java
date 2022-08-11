package Date5;

public class countNegandPos {
public static void main(String[] args) {
	int arr[]= {-1,-2,10,11,-13};
	int c=0,c1=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			c++;
		}
		else {
			c1++;
		}
	}
	System.out.println("Negative Count is:"+c1);
	System.out.println("Poistive count is:"+c); 
}
}
