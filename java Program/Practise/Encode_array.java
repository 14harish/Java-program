
public class Encode_array {
public static void main(String[] args) {
	int sum=0;
	int arr[]= {8,-10,3,-15};
	int[] encode=new int[arr.length];
	for(int i=arr.length-1;i>0;i--) {
			encode[i]=arr[i]-arr[i-1];
	}
	
	for(int i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
		encode[i]=arr[i];
		}
		else {
			encode[i]=encode[i+1];
		}
	}
	System.out.println("Orginal Array:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		System.out.print("");
	}
	System.out.println("\nEncode of Array:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(encode[i]);
		System.out.print(" ");
	}
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println("\nsum of all number in orginal:"+sum);
	System.out.println("First number in the array:"+arr[0]);
}
}
