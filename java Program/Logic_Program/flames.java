import java.util.*;

public class flames {
public static void main(String[] args) {
		int len=5,count=0,l=0;
		StringBuffer sc=new StringBuffer(" FLAMES");
		int arr[]=new int[sc.length()];
		for(int i=0;i<arr.length;i++) {
		char ch=sc.charAt(i);
		//System.out.println(ch);
		if(arr[i]!=-1) {
		count++;
		}
		if(count==len && sc.charAt(i)!=' ') {
		arr[i]=-1;
		count=-1;
		sc.replace(i, i+1," ");
		}
		if(i==arr.length-1) {
		i=0;
		}
		String s= sc.toString();
		s=s.replace(" ","");
		if(s.length()==1) {
		break;
		}
		}
		System.out.println(sc);
		}
		}
		