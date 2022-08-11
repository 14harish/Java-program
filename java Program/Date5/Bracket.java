package Date5;

public class Bracket {
public static void main(String[] args) {
	String in="a)*(x))y";
	int c=0,c1=0;
	for(int i=0;i<in.length();i++) {
		if(in.charAt(i)=='(') {
			c++;
		}
		if(in.charAt(i)==')') {
			c1++;
		}
	}
	if(c==c1) {
		if(in.charAt(0)=='(' && in.charAt(in.length()-1)==')') {
		System.out.println("True");	
		}
		else {
			System.out.println("False");
		}
	}
	else {
		System.out.println("False");
	}
}
}
