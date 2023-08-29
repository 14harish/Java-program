import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mrk=sc.nextInt();
        if(mrk<0 || mrk>100){
            System.out.println("Invalid mrk");
            return;
        }
        if(mrk>90 && mrk <=100) System.out.println("O Grade");
        else if(mrk>80 &&mrk <=90) System.out.println("A+ Grade");
        else if(mrk>70 &&mrk <=80) System.out.println("A Grade");
        else if(mrk>60 &&mrk <70) System.out.println("B+ Grade");
        else if(mrk>50 &&mrk <60) System.out.println("B Grade");
        else System.out.println("RA");
    }
}
