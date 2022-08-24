package Date6;


public class expressionSring {
public static void main(String[] args) {
	String name="2+3*9";
	StringBuffer s2=new StringBuffer(name);
	int b=0,sum=Character.getNumericValue(name.charAt(0));
	for(int i=0;i<s2.length();i++) {
		if(s2.charAt(i)=='*') {
			b=Character.getNumericValue(s2.charAt(i+1));
			sum*=b;
		}
		else if(s2.charAt(i)=='/') {
			b=Character.getNumericValue(s2.charAt(i+1));
			sum/=b;
		}
		else if(s2.charAt(i)=='+') {
			b=Character.getNumericValue(s2.charAt(i+1));
			sum+=b;
		}
		else if(s2.charAt(i)=='-') {
			b=Character.getNumericValue(s2.charAt(i+1));
			sum-=b;
		}
	}
	System.out.println(sum);
}
}
