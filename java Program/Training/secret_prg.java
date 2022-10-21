
public class secret_prg {
public static void main(String[] args) {
int input1=12;
int input2=4;
String input3="Hello-World!";
//Good_Night
char[] in=input3.toCharArray();
char[] str=new char[in.length]; 
int[] arr=new int[input3.length()];
for(int i=0;i<in.length;i++) {
         if(Character.isUpperCase(in[i])) {
        	// System.out.println((int)in[i]);
        	 arr[i]=(int)(in[i])-64;
         }
         else if(Character.isLowerCase(in[i])){
        	 arr[i]=(int)(in[i])-96;
         }
	if(arr[i]!=0) {
		arr[i]=input2+arr[i];
		if(arr[i]>26) {
			arr[i]=arr[i]-26;
		}
	}
	else {
		arr[i]=-1;
		str[i]=in[i];
	}
	arr[i]=arr[i];
	//System.out.println(arr[i]);
}
for(int i=0;i<in.length;i++) {
		if(arr[i]>0) {
        	 if(Character.isUpperCase(in[i])) {
        	 str[i]=(char) (arr[i]+64);
         }
        	  else if(Character.isLowerCase(in[i])){
             	 str[i]=(char) (arr[i]+96);
           }
		}
}
for(int i=0;i<str.length;i++) {
	System.out.print(str[i]);
}
}
}
