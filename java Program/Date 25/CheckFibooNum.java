public class CheckFibooNum {
    public static void main(String[] args) {
        int a=0,b=1,c=0,num=27,count=0;
        while(true){
            c=a+b;
            b=a;
            c=b;
            System.out.println(c);
            if(c==num){
                count=1;
                break;
            }
        }
        if(count==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
