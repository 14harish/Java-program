package metta;
import java.util.*;
public class pinMethod2 {
    public static void main(String[] args) {
    ArrayList<Integer> sc=new ArrayList<>();
    int input1=123;
	int input2=456;
	int input3=789;
		int last[]={input1%10,input2%10,input3%10};
		int middle[]={(input1%100)/10,(input2%100)/10,(input3%100)/10};
		int first[]={(input1/100),(input1/100),(input1/100)};
		int fin=small(last, middle, first);
		int digit=0;
		Arrays.sort(last);
		Arrays.sort(first);
		Arrays.sort(middle);
		sc.add(fin);
		sc.add(first[0]);
		sc.add(middle[0]);
		sc.add(last[0]);
		for(int i=0;i<sc.size();i++){
			digit=digit*10+sc.get(i);
		}
		System.out.println(digit);
	}
	static void display(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	static int small(int last[],int first[],int middle[]){
		ArrayList<Integer> sc=new ArrayList<>();
		for(int i=0;i<last.length;i++){
			sc.add(last[i]);
			sc.add(middle[i]);
			sc.add(first[i]);
		}
		Collections.sort(sc);
		int n=sc.get(sc.size()-1);
		return n;
	}
}
