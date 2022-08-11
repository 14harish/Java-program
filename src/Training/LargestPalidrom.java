package Training;

public class LargestPalidrom {
public static void main(String[] args) {
	String name="template";
	char last = 0;
	StringBuffer n=new StringBuffer(name);
	String s=n.reverse().toString();
	if(name.equals(s)) {
		System.out.println(name);
	}
	else {
	StringBuffer c=new StringBuffer();
	StringBuffer sc=new StringBuffer();
	int arr[]=new int[name.length()];
	int count=0;
	for(int i=0;i<name.length();i++) {
		count=1;
		for(int j=i+1;j<name.length();j++) {
			if(name.charAt(i)==name.charAt(j)) {
				count++;
				arr[j]=-1;
			}
		}
		if(arr[i]!=-1) {
			if(count==2) {
				c.append(name.charAt(i));
			}
			else {
				last=name.charAt(i);
			}
			//System.out.println(name.charAt(i)+":"+count);
		}
	}
sc.append(c);
sc.reverse();
c.append(sc);
c.insert(c.length()/2, last);
if(c.length()>1) {
System.out.println(c);
System.out.println(c.length());
}
else {
	System.out.println(-1);
}
}
}
}
