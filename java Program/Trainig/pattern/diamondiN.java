package Trainig.pattern;

public class diamondiN {
    public static void main(String[] args) {
        int n=15;
        int star=n/2+1;
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n/2+1){
                star-=1;
                space+=2;
            }else if(i==n/2+1){
                star=2;
                space-=2;
            }
            else{
                space-=2;
                star+=1;
            }
        }
    }
    
}
