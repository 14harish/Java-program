package Date6;

public class countDigit {
public static void main(String[] args) {
	String in="g+abc*ty-56";
	String na[]=in.split("[^0-9]");
	int count=0;
	for(int i=0;i<na.length;i++) {
		if(na[i].length()!=0) {
			count++;
		}
		//System.out.println(na[i]);
	}
	System.out.println(count);
}
}
