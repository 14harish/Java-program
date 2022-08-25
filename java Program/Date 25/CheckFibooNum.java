public class CheckFibooNum {
    public static void main(String[] args) {
        int a=0,b=1,c=0,num=5,count=0;
        if(num==1 ||num==0){
            System.out.println("True");
            return;
        }
        for(int i=0;i<num;i++){
            c=a+b;
            System.out.println(i+" "+num);
            if(c==num){
                count=1;
            }
            a=b;
            b=c;
        }
        if(count==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

