/*Input: 7
OP:
ABCDEFGFEDCBA
ABCDEF FEDCBA
ABCDE   EDCBA
ABCD     DCBA
ABC       CBA
AB         BA
A           A
*/
package DoubleDecrease;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=7;//sc.nextInt();
        char temp='A';

        for(int i=0;i<size;i++){
            char ch='A',back=(char)('A'+(size-2));
            for(int j=0;j<size-i;j++) {
//                System.out.print("*");
                System.out.print(ch);
                ch++;
            }
            for(int j=1;j<=i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(" ");
//            char temp=ch;//(char)(ch-1);
            for(int j=0;j<size-i;j++) {
                System.out.print(back);
                back--;
            }
            System.out.println();
        }
    }
}
