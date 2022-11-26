import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class stopAndwait_cilent {
    public static void main(String[] args) throws Exception{
        run();
    }
    public static void run() throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Frames");
        int n=sc.nextInt();
        Socket input=new Socket("localhost",9999);
        PrintStream s=new PrintStream(input.getOutputStream());
        for(int i=0;i<n;){
            if(i==n){
                s.println("exit");
                break;
            }
            System.out.println("Frames "+i+" Send");
            s.println(i);
            Scanner v=new Scanner(input.getInputStream());
            String ack=v.next();
            // System.out.println(ack);
            if(ack!=null){
                System.out.println("Ack is Recived");
                i++;
            }
            else{
                s.println(i);
            }

        } 
        sc.close();
    }
}
