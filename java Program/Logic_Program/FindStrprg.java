package metta;

public class FindStrprg {
    public static void main(String[] args) {
        String input1="world wide web";
        StringBuffer sc=new StringBuffer();
		String[] str=input1.split(" ");
        int sum=0;
		for(int i=0;i<str.length;i++){
			sum=pos(str[i]);
			sc.append(sum);
		}
		System.out.println(sc);
	}
	static int pos(String input1){
		input1=input1.toLowerCase();
		int n=0;
		int arr[]=new int[input1.length()];
		for(int i=0;i<arr.length;i++){
			if(input1.charAt(i)>='a' && input1.charAt(i)<='z' ){
                arr[i]=(int)input1.charAt(i)-96;
			}
		}
		if(arr.length%2==0){
        for(int i=0;i<arr.length/2;i++){
			//System.out.println(arr[i]);
            n+=Math.abs(arr[i]-arr[(arr.length-1)-i]);
        }
    }
    else{
        for(int i=0;i<arr.length;i++){
            n+=Math.abs(arr[i]-arr[(arr.length-1)-i]);
            if(i==arr.length/2){
               // System.out.println(arr[i]);
                n+=arr[i];
                break;
            }
    }
    }
		return n;
	}  
	}
