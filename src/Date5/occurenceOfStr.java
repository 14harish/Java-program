package Date5;
import java.util.*;
public class occurenceOfStr {
public static void main(String[] args) {
	String n="malayalam";
//	ArrayList<Character> s=new ArrayList<>();
//	for(int i=0;i<n.length();i++) {
//		s.add(n.charAt(i));
//	}
//	for(Character g:s) {
//		System.out.println(g+":"+Collections.frequency(s, g));
//	}
	char[] ch=n.toCharArray();
	int[] c=new int[ch.length];
	int count=0;
	for(int i=0;i<ch.length;i++) {
		count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				c[j]=-1;
			}
		}
		if(c[i]!=-1) {
			System.out.println(ch[i]+"="+count);
		}
	}
}
}
