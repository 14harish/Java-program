package metta;

public class sumofsum {
    public static void main(String[] args) {
    int n=58123;
		int sum=0;
		StringBuffer sc=new StringBuffer(n+"");
		for(int i=0;i<sc.length();i++){
			for(int j=i;j<sc.length();j++){
                sum+=sc.charAt(j)-'0';
			}
		}
		System.out.println(sum);
	}
    //(5+8+1+2+3)+(8+1+2+3)+(1+2+3)+(2+3)+(2)=47
}
