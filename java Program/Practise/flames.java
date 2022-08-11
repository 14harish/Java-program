package Practise;
import java.util.*;

public class flames {
public static void main(String[] args) {
	String name="flames";
	int count=4,c=0,c1=0;
	LinkedList<String> s=new LinkedList<>();
	for(String n:name.split("")) {
		s.add(n);
	}
	int m=s.size();
	for(int i=0;i<s.size();i++) {
		c++;
		c1++;
		if(c==count) {
			s.remove(i);
			c=1;
		}
		if(c1==m) {
			c1=0;
		}
		System.out.println(c+"="+s.get(i));
		if(c1==s.size()-1) {
			i=0;
		}
		
	}
	System.out.println(s);
}
}
