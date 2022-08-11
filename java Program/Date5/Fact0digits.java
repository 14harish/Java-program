package Date5;

public class Fact0digits {
public static void main(String[] args) {
	int n=7,count=0;
	int fact=fact(n);
	System.out.println(fact);
	while(fact!=0) {
		int d=fact%10;
		if(d==0) {
			count++;
		}
		fact=fact/10;
	}
	System.out.println(count);
}
static int fact(int n) {
	if(n==1) {
		return 1;
	}
	else {
		return n*fact(n-1);	
	}
	}
}
