public class FindStringCode {
    public static void main(String[] args) {
        String name="World Wide Web";
        String arr[]=name.split(" ");
		int d=0;
		String out="";
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i].toLowerCase();
			d=res(arr[i]);
			out+=d+"";
		}
		int a=Integer.parseInt(out);
		System.out.println(out);
		System.out.println(a);
	}
	public static int res(String s){
		int sum=0;
		int j=s.length()-1;
		for(int i=0;i<s.length();i++){
		if(s.length()%2!=0){
            if(i==j){
				sum+=s.charAt(i)-96;
				break;
			}
		}else{
			if(i>j){
				break;
			}
		}
			System.out.println(i+" "+j);
			sum+=Math.abs((s.charAt(i)-96)-(s.charAt(j)-96));
			System.out.println(sum);
			j--;
		}
		return sum;
	} 
    }    

