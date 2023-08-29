import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num-1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||i==num||j==1|j==num) System.out.print("*");
                else System.out.print(" ");
                if(i!=1&&i!=num){
                    if(i==j && i!=(num/2)+1) System.out.print("*");
                    else System.out.print(" ");
                }
                else System.out.print(" ");
                if( i>1 && i<num&& j==temp){
                    if(j==(num/2)+1){
                        temp--;
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                    temp--;
                }
                else System.out.print(" ");
                /*if(j==temp) {
                    if(j==(num/2)+1){
                        temp--;
                        continue;
                    }
                    System.out.print("*");
                    temp--;
                }
                else System.out.print(" ");*/
            }
            System.out.println();
        }
    }
}