package metta;

public class decreasingseq {
    public static void main(String[] args) {
    	        //Write code here...
        int input1[]={11,1,2,1,0,2,2,2,1,4};
        int input2=input1.length;
		int out1=0;
		int out2=0;
		int count=1,c=0;
		if(input2==1){
			out1=0;
			out2=0;
		}
		else{
		for(int i=0;i<input2-1;i++){
			if(input1[i]>input1[i+1]){
				count++;
			}
			else{
                if(count>1){
                    out1++;
                }
                if(out2<count){
                    out2=count;
                    count=1;
                }
			}
		}
        System.out.println(out1+"-"+out2);
		}
}
}
