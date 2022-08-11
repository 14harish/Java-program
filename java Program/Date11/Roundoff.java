package Date11;

public class Roundoff {
public static void main(String[] args) {
	int a=1;
	double i=1.0;
	double n=45.67843;
	while(a!=0){
		i=i*10.0;
		a--;
	}
	n=Math.round((n*i))/i;
	System.out.println(n);
}
}
