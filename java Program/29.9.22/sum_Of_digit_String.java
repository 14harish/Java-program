public class sum_Of_Digit_In_String {
 public static void main(String[] args) { 
	 String word="wlc22o3m";
	 int sum=0;
	 for(int i=0;i<word.length();i++) {
		 if(Character.isDigit(word.charAt(i))) {
			 sum+=Character.getNumericValue(word.charAt(i));
		 }
	 }
	 System.out.println(sum);
 }
}