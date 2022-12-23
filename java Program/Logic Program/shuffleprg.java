package Training;
import java.util.*;
public class shuffleprg {
	 static int st,st1;
static ArrayList<String> output = new ArrayList<String>();

	 public static void main(String[] args) {

	 ArrayList<String> input1 = new ArrayList<String>();

	 input1.add("1000");

	 input1.add("3000");

	 input1.add("o12v43n"); 

	 st=Integer.parseInt(input1.get(0));

	 st1=Integer.parseInt(input1.get(1));
	 
	 monthYear (input1 );

	 }

	static ArrayList<String> monthYear(ArrayList<String> input){

	  input.set(2, input.get(2).toUpperCase());

	  String n=input.get(2).toString();

	  String ch= "";

	  String num= "";

	  for(int i=0;i<n.length();i++) {

	   if(Character.isDigit(n.charAt(i))) {

	    num+=n.charAt(i);

	   }

	   else {

	    ch+=n.charAt(i);

	   }

	  }

	  String[] year= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

	  String ch1="";

	  for(int i=0;i<year.length;i++) {

	   String sam=year[i];

	   for(int j=0;j<sam.length();j++) {

	    for(int k=0;k<ch.length();k++) {

	     if(ch.charAt(k)==sam.charAt(j)) {

	      ch1+=sam.charAt(j);

	     }

	    }

	   }

	   if(ch1.equals(sam)) {

	    break;

	   }

	   else {

	    ch1="";

	   }

	  }

	  shuffle1(num,ch1);
	  
	  return input;

	 }

	static void shuffle1(String num,String ch1) {

	 char num1[]= new char[10]; 

	 for(int i=0;i<num.length();i++) {

	  num1[i]=num.charAt(i);

	 }

	 ArrayList<Character> n= new ArrayList<>();


	 for(int i=0;i<num.length();i++) {

	  n.add(num1[i]);

	 }



	 HashSet<Integer> h=new HashSet<>();

	 for(int i=0;i<1000;i++) {

	  Collections.shuffle(n);

	  int jj=0;

	  for(int j=0;j<4;j++) {

	   jj=jj*10+Integer.parseInt(n.get(j)+"");
	  }

	  h.add(jj);

	 }
	 int count=0;
	 for(Integer i:h) {
	if(i>st && i<st1) {
		count++;
		String s=ch1+"/"+i.toString();
		output.add(s);
	}
	 }
	 Collections.sort(output);
	 System.out.println(output);
	 System.out.println(count);
	}
	}
