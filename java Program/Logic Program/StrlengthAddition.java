package metta;

public class StrlengthAddition {
    public static void main(String[] args) {
    String n="wipro technologies";
    int sum=0;
    n=n.replace(" " ,"");
    int s=n.length();
    while(s!=0){
        int d=s%10;
        sum+=d;
        s=s/10;
        if(sum>9){
            s=sum;
            sum=0;
        }
    }    
    System.out.println(sum);
    }
}
