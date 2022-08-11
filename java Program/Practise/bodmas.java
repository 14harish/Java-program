package Practise;

public class bodmas {
public static void main(String[] args) {
	String name="2+3*5";
	StringBuffer s2=new StringBuffer(name);
	int a=0,b=0,sum=0;
	for(int i=0;i<s2.length();i++) {
		if(s2.charAt(i)=='*') {
			a=Character.getNumericValue(s2.charAt(i-1));
			b=Character.getNumericValue(s2.charAt(i+1));
			sum=a*b;
			s2.delete(i, i+2);
			s2.replace(i-1, i, sum+"");
		}
		}
	sum=Character.getNumericValue(name.charAt(0));
	for(int i=0;i<s2.length();i++) {
		
		if(s2.charAt(i)=='+') {
			b=Character.getNumericValue(s2.charAt(i+1));
			System.out.println(b);
			sum+=b;
		}
		if(s2.charAt(i)=='-') {
			b=Character.getNumericValue(s2.charAt(i+1));
			sum-=b;
		}
	}
	System.out.println(sum);
	System.out.println(s2);
}
}
