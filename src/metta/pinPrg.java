package metta;import java.util.*;
public class pinPrg {
public static void main(String[] args) {
	int input1=123;
	int input2=456;
	int input3=789;
	int ones[]={input1%10,input2%10,input3%10};
	int[] tens={(input1%100)/10,(input2%100)/10,(input3%100)/10};
	int[] lastdigit={input1/100,input2/100,input3/100};
	int[] pin=new int[4];
	int pin1=0;
	// int big=bigValue(ones,tens,lastdigit);
	// System.out.println(big);
	pin[0]=bigValue(ones,tens,lastdigit);
	pin[3]=least(ones);
	pin[2]=least(tens);
	pin[1]=least(lastdigit);
	for(int i=0;i<pin.length;i++){
		pin1=pin1*10+pin[i];
	}
	System.out.println(pin1);
	}
	static int least(int input[]){
	Arrays.sort(input);
	int n=input[0];
	return n;
	} 
	static int bigValue(int ones[],int tens[],int lastdigit[]){
	ArrayList<Integer> m=new ArrayList<>();
	for(int i=0;i<ones.length;i++){
		m.add(ones[i]);
		m.add(tens[i]);
		m.add(lastdigit[i]);
	}
	int big=Collections.max(m);
	return big;
	}
}

