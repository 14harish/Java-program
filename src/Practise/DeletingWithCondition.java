package Practise;
import java.util.*;

public class DeletingWithCondition {
public static void main(String[] args) {
	String name="Harish";
	StringBuffer sc=new StringBuffer(name);
	String arr[]=new String[name.length()*2];
//	System.out.println(arr.length);
	int count=5;	
	   for(int j=0;j<name.length();j++) {
		if(j==count-1) {
			sc.deleteCharAt(j);
			name=sc+"";
			sc.delete(0, j);
			sc.append(name);
			sc.deleteCharAt(name.length());
		}
	   }
	   System.out.println(name);
	   System.out.println(sc);
	}

}
