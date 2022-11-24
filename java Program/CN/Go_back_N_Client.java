import java.util.*;
import java.net.*;
import java.io.*;
public class Go_back_N_Client {
    public static void main(String args[]) throws Exception{
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Window Size:");
        int w=sc.nextInt();
        System.out.println("Enter Total Frame");
        int f=sc.nextInt();
        for(int j=0;j<f;j++){
           for(int i=0;i<w;i++){
              System.out.println(i);
              j++;
            }
            System.out.println("---"+j);
    }       
    }
}
