package Training;
import java.util.*;

public class Hill_Climber_Encryption_2D_Array {
    public static void main(String[] args) {
        Scanner sb=new Scanner(System.in);
        System.out.println("Enter PlainText");
        String in=sb.nextLine().toUpperCase();
        System.out.println("Enter Key:");
        String key=sb.nextLine().toUpperCase();
        int k=0;
        int sum=0;
        int d[][]=new int[in.length()][in.length()];
        int a[]=new int[in.length()];
        StringBuffer sc=new StringBuffer();
        for(int i=0;i<in.length();i++) {
            a[i]=in.charAt(i)-'A';
        for(int j=0;j<in.length();j++) {
            d[i][j]= key.charAt(k)-'A';
            k++;
        }
        }
        for(int i=0;i<a.length;i++) {
            sum=0;           
            int j=0;
                for(int p=0;p<a.length;p++) {
                        sum+=d[i][j]*a[p];
                        j++;
                    }
                sc.append((char)((sum%26)+'A'));
            }
         System.out.println("Clipheretext:"+sc);
        }
    }